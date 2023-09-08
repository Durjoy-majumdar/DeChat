package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import p158gt.C59701t;
import p158gt.C98209y;
import p548hg.C98450d;

/* renamed from: com.tencent.mm.ui.chatting.j4 */
public class C97157j4 implements C98209y {

    /* renamed from: a */
    public final /* synthetic */ Intent f285101a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f285102b;

    /* renamed from: c */
    public final /* synthetic */ List f285103c;

    /* renamed from: d */
    public final /* synthetic */ String f285104d;

    /* renamed from: e */
    public final /* synthetic */ int f285105e;

    /* renamed from: f */
    public final /* synthetic */ boolean f285106f;

    /* renamed from: g */
    public final /* synthetic */ C59701t f285107g;

    public C97157j4(SendImgProxyUI sendImgProxyUI, Intent intent, ArrayList arrayList, List list, String str, int i, boolean z, C59701t tVar) {
        this.f285101a = intent;
        this.f285102b = arrayList;
        this.f285103c = list;
        this.f285104d = str;
        this.f285105e = i;
        this.f285106f = z;
        this.f285107g = tVar;
    }

    public void onDone() {
        ((C98450d) C86312j.m106911c(C98450d.class)).Eu0(this.f285102b, this.f285103c, this.f285101a.getStringArrayListExtra("key_select_mix_media_list"), this.f285101a.getIntArrayExtra("key_select_media_idex_list"), this.f285104d, this.f285105e, this.f285106f, this.f285107g);
    }
}
