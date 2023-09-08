package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.wework.api.IWWAPI;
import java.util.List;

/* renamed from: com.tencent.mm.ui.chatting.r4$$e */
public class r4$$e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f285162d;

    /* renamed from: e */
    public final /* synthetic */ C72996z1 f285163e;

    /* renamed from: f */
    public final /* synthetic */ List f285164f;

    /* renamed from: g */
    public final /* synthetic */ boolean f285165g;

    /* renamed from: h */
    public final /* synthetic */ IWWAPI.WWAppType f285166h;

    /* renamed from: i */
    public final /* synthetic */ int f285167i;

    public r4$$e(Context context, C72996z1 z1Var, List list, boolean z, IWWAPI.WWAppType wWAppType, int i) {
        this.f285162d = context;
        this.f285163e = z1Var;
        this.f285164f = list;
        this.f285165g = z;
        this.f285166h = wWAppType;
        this.f285167i = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C97182r4.m125138a(this.f285162d, this.f285163e, this.f285164f, this.f285165g, this.f285166h, this.f285167i);
    }
}
