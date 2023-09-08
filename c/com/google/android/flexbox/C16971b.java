package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.flexbox.b */
public class C16971b {

    /* renamed from: a */
    public int f45943a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f45944b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f45945c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f45946d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f45947e;

    /* renamed from: f */
    public int f45948f;

    /* renamed from: g */
    public int f45949g;

    /* renamed from: h */
    public int f45950h;

    /* renamed from: i */
    public int f45951i;

    /* renamed from: j */
    public float f45952j;

    /* renamed from: k */
    public float f45953k;

    /* renamed from: l */
    public int f45954l;

    /* renamed from: m */
    public int f45955m;

    /* renamed from: n */
    public List<Integer> f45956n = new ArrayList();

    /* renamed from: o */
    public int f45957o;

    /* renamed from: p */
    public int f45958p;

    /* renamed from: q */
    public boolean f45959q;

    /* renamed from: r */
    public boolean f45960r;

    /* renamed from: a */
    public void mo18598a(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f45943a = Math.min(this.f45943a, (view.getLeft() - flexItem.getMarginLeft()) - i);
        this.f45944b = Math.min(this.f45944b, (view.getTop() - flexItem.getMarginTop()) - i2);
        this.f45945c = Math.max(this.f45945c, view.getRight() + flexItem.getMarginRight() + i3);
        this.f45946d = Math.max(this.f45946d, view.getBottom() + flexItem.getMarginBottom() + i4);
    }
}
