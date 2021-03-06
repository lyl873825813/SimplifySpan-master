package com.henley.simplifyspan.style;

import android.text.Spanned;

/**
 * 特殊原始样式
 * @author Henley
 * @date 2017/7/7 18:02
 */
public class SpecialRawSpanStyle extends BaseSpecialStyle {

    private Object spanObj;
    private int flags;

    public SpecialRawSpanStyle(String specialText, Object spanObj) {
        super(specialText);
        this.spanObj = spanObj;
        this.flags = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE;
    }

    public SpecialRawSpanStyle(String specialText, Object spanObj, int flags) {
        super(specialText);
        this.spanObj = spanObj;
        this.flags = flags;
    }

    public Object getSpanObj() {
        return spanObj;
    }

    public int getFlags() {
        return flags;
    }

}