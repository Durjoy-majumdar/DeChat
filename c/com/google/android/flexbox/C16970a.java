package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* renamed from: com.google.android.flexbox.a */
public interface C16970a {
    /* renamed from: a */
    int mo18500a(View view);

    /* renamed from: b */
    int mo18502b(View view, int i, int i2);

    /* renamed from: e */
    void mo18506e(C16971b bVar);

    /* renamed from: g */
    void mo18508g(View view, int i, int i2, C16971b bVar);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<C16971b> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    /* renamed from: i */
    View mo18527i(int i);

    /* renamed from: j */
    int mo18528j(int i, int i2, int i3);

    /* renamed from: l */
    View mo18530l(int i);

    /* renamed from: m */
    int mo18531m(int i, int i2, int i3);

    /* renamed from: q */
    void mo18538q(int i, View view);

    /* renamed from: r */
    boolean mo18539r();

    void setFlexLines(List<C16971b> list);
}
