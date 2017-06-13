package com.prolificinteractive.materialcalendarview.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;

/**
 * Created by Administrator on 2017/6/12 0012.
 */

public class DescriptionSpan implements LineBackgroundSpan {

    /**
     * Default radius used
     */
    public static final float DEFAULT_RADIUS = 3;

    private final float radius;
    private final int color;

    public DescriptionSpan() {
        this.radius = DEFAULT_RADIUS;
        this.color = 0;
    }

    public DescriptionSpan(float radius, int color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void drawBackground(
            Canvas canvas, Paint paint,
            int left, int right, int top, int baseline, int bottom,
            CharSequence charSequence,
            int start, int end, int lineNum
    ) {
        int oldColor = paint.getColor();
        float oldTxtSize = paint.getTextSize();
        if (color != 0) {
            paint.setColor(color);
        }
        paint.setTextSize(20);
        canvas.drawCircle((left + right) / 2, (top + bottom)/2, (left + right) / 2-10, paint);
//        canvas.drawText("休",(left + right) / 2-10,bottom+15,paint);
        paint.setColor(oldColor);
        paint.setTextSize(oldTxtSize);
    }
}
