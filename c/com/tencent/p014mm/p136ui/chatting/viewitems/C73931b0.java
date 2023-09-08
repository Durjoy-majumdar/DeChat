package com.tencent.p014mm.p136ui.chatting.viewitems;

import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.manager.C73758a;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C35135l;
import p261wl.C15510f;
import p261wl.C38172g;
import p872ah.C67046a;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b0 */
public class C73931b0 implements C38172g<C35135l> {

    /* renamed from: a */
    public final /* synthetic */ C67391b f216995a;

    /* renamed from: b */
    public final /* synthetic */ String[] f216996b;

    /* renamed from: c */
    public final /* synthetic */ int f216997c;

    /* renamed from: d */
    public final /* synthetic */ String[] f216998d;

    /* renamed from: e */
    public final /* synthetic */ String[] f216999e;

    /* renamed from: f */
    public final /* synthetic */ String[] f217000f;

    /* renamed from: g */
    public final /* synthetic */ int[] f217001g;

    /* renamed from: h */
    public final /* synthetic */ String f217002h;

    /* renamed from: i */
    public final /* synthetic */ String f217003i;

    public C73931b0(C67391b bVar, String[] strArr, int i, String[] strArr2, String[] strArr3, String[] strArr4, int[] iArr, String str, String str2) {
        this.f216995a = bVar;
        this.f216996b = strArr;
        this.f216997c = i;
        this.f216998d = strArr2;
        this.f216999e = strArr3;
        this.f217000f = strArr4;
        this.f217001g = iArr;
        this.f217002h = str;
        this.f217003i = str2;
    }

    public boolean invoke(C15510f fVar) {
        C73758a aVar = this.f216995a.f193278b;
        String str = this.f216996b[this.f216997c];
        long nowMilliSecond = Util.nowMilliSecond();
        String[] strArr = this.f216998d;
        int i = this.f216997c;
        ((C35135l) fVar).mo56405nA((C67046a) aVar.mo102812a(C79368l.class), str, nowMilliSecond, strArr[i], this.f216999e[i], this.f217000f[i], this.f217001g[i], (String) null, this.f217002h, this.f217003i, 1);
        return false;
    }
}
