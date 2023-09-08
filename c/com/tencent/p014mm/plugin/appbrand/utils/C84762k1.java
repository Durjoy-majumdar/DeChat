package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.k1 */
public class C84762k1 implements C80669j.C80675f {

    /* renamed from: a */
    public final /* synthetic */ long f247175a;

    /* renamed from: b */
    public final /* synthetic */ String f247176b;

    /* renamed from: c */
    public final /* synthetic */ C84754j1.C84756b f247177c;

    /* renamed from: d */
    public final /* synthetic */ long f247178d;

    public C84762k1(long j, String str, C84754j1.C84756b bVar, long j2) {
        this.f247175a = j;
        this.f247176b = str;
        this.f247177c = bVar;
        this.f247178d = j2;
    }

    /* renamed from: a */
    public void mo112506a(String str, C80669j.C80676g gVar) {
        if (gVar.sourceLength <= 0) {
            gVar.sourceLength = (int) this.f247175a;
        }
        C84754j1.m104417a(this.f247176b, this.f247177c, str, this.f247178d);
        C84754j1.C84756b bVar = this.f247177c;
        if (bVar instanceof C84754j1.C84757c) {
            ((C84754j1.C84757c) bVar).mo117481a(gVar);
        }
    }
}
