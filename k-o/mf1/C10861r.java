package mf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import jq3.C60905o;
import pf1.C11920q;

/* renamed from: mf1.r */
public final class C10861r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C10863s f32430d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f32431e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f32432f;

    /* renamed from: g */
    public final /* synthetic */ View f32433g;

    /* renamed from: h */
    public final /* synthetic */ C11920q f32434h;

    /* renamed from: i */
    public final /* synthetic */ String f32435i;

    public C10861r(C10863s sVar, BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str) {
        this.f32430d = sVar;
        this.f32431e = baseFinderFeed;
        this.f32432f = oVar;
        this.f32433g = view;
        this.f32434h = qVar;
        this.f32435i = str;
    }

    public final void run() {
        C10863s sVar = this.f32430d;
        BaseFinderFeed baseFinderFeed = this.f32431e;
        C60905o oVar = this.f32432f;
        View view = this.f32433g;
        C11920q qVar = this.f32434h;
        sVar.mo11074x(baseFinderFeed, oVar, view, qVar, this.f32435i, sVar.mo11079C(qVar), true);
    }
}
