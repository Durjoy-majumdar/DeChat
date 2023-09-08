package androidx.gridlayout.widget;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.gridlayout.widget.a */
public final class C16596a extends GridLayout.C16587h {

    /* renamed from: a */
    public final /* synthetic */ GridLayout.C16587h f44655a;

    /* renamed from: b */
    public final /* synthetic */ GridLayout.C16587h f44656b;

    public C16596a(GridLayout.C16587h hVar, GridLayout.C16587h hVar2) {
        this.f44655a = hVar;
        this.f44656b = hVar2;
    }

    /* renamed from: a */
    public int mo16878a(View view, int i, int i2) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        boolean z = true;
        if (C107207u.C107209c.m145195d(view) != 1) {
            z = false;
        }
        return (!z ? this.f44655a : this.f44656b).mo16878a(view, i, i2);
    }

    /* renamed from: c */
    public String mo16879c() {
        return "SWITCHING[L:" + this.f44655a.mo16879c() + ", R:" + this.f44656b.mo16879c() + "]";
    }

    /* renamed from: d */
    public int mo16880d(View view, int i) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        boolean z = true;
        if (C107207u.C107209c.m145195d(view) != 1) {
            z = false;
        }
        return (!z ? this.f44655a : this.f44656b).mo16880d(view, i);
    }
}
