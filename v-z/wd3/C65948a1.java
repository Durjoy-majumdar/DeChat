package wd3;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.comm.C55593g;
import ic0.C21070h;
import jc0.C21210b;
import p823sg.C90193h;

/* renamed from: wd3.a1 */
public class C65948a1 implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ Context f189608a;

    /* renamed from: b */
    public final /* synthetic */ View f189609b;

    /* renamed from: c */
    public final /* synthetic */ boolean[] f189610c;

    public C65948a1(C65949b1 b1Var, Context context, View view, boolean[] zArr) {
        this.f189608a = context;
        this.f189609b = view;
        this.f189610c = zArr;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        Bitmap bitmap = bVar.f59988d;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f189610c[0] = true;
            return;
        }
        C55593g.f158270a.mo77114b(this.f189608a, this.f189609b, bVar.f59988d, C90193h.m112878f(str.getBytes()));
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        return null;
    }
}
