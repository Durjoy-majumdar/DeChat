package com.tencent.p014mm.plugin.profile;

import android.content.Intent;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.UserProfileItemClickLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import lf2.C34235a;
import p773yy.C79168k;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.profile.h */
public class C42599h extends C86301e {

    /* renamed from: e */
    public static C72996z1 f115274e;

    /* renamed from: f */
    public static Boolean f115275f;

    /* renamed from: g */
    public static Boolean f115276g;

    /* renamed from: d */
    public C34235a f115277d = null;

    /* renamed from: com.tencent.mm.plugin.profile.h$a */
    public class C42600a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Intent f115278d;

        /* renamed from: e */
        public final /* synthetic */ int f115279e;

        /* renamed from: f */
        public final /* synthetic */ int f115280f;

        /* renamed from: g */
        public final /* synthetic */ String f115281g;

        public C42600a(Intent intent, int i, int i2, String str) {
            this.f115278d = intent;
            this.f115279e = i;
            this.f115280f = i2;
            this.f115281g = str;
        }

        public void run() {
            UserProfileItemClickLogStruct userProfileItemClickLogStruct = new UserProfileItemClickLogStruct();
            userProfileItemClickLogStruct.f194643d = (long) C42599h.vx0(this.f115278d);
            userProfileItemClickLogStruct.f194649j = (long) this.f115278d.getIntExtra("CONTACT_INFO_UI_SUB_SOURCE", 0);
            userProfileItemClickLogStruct.f194644e = (long) this.f115279e;
            userProfileItemClickLogStruct.f194645f = (long) this.f115280f;
            userProfileItemClickLogStruct.f194646g = userProfileItemClickLogStruct.mo86045b("username", this.f115281g, true);
            userProfileItemClickLogStruct.f194648i = userProfileItemClickLogStruct.mo86045b("TextStatusID", ((C79168k) C86312j.m106911c(C79168k.class)).mo74127if(this.f115281g), true);
            if (this.f115278d.getIntExtra("key_label_click_source", 0) > 0) {
                userProfileItemClickLogStruct.f194643d = 22;
            }
            C72996z1 z1Var = C42599h.f115274e;
            if (z1Var != null && z1Var.getUsername().equals(this.f115281g)) {
                Boolean bool = C42599h.f115275f;
                long j = 1;
                if (bool == null) {
                    userProfileItemClickLogStruct.f194650k = 0;
                } else {
                    userProfileItemClickLogStruct.f194650k = bool.booleanValue() ? 1 : 2;
                }
                Boolean bool2 = C42599h.f115276g;
                if (bool2 == null) {
                    userProfileItemClickLogStruct.f194651l = 0;
                } else {
                    userProfileItemClickLogStruct.f194651l = bool2.booleanValue() ? 1 : 2;
                }
                userProfileItemClickLogStruct.f194652m = Util.isNullOrNil(C42599h.f115274e.f149516U) ? 2 : 1;
                C72996z1 z1Var2 = C42599h.f115274e;
                int i = z1Var2.f149500H;
                if (i == 0) {
                    userProfileItemClickLogStruct.f194653n = 0;
                } else {
                    userProfileItemClickLogStruct.f194653n = i == 1 ? 1 : 2;
                }
                if (Util.isNullOrNil(z1Var2.f149516U)) {
                    j = 2;
                }
                userProfileItemClickLogStruct.f194652m = j;
            }
            userProfileItemClickLogStruct.mo86054n();
        }
    }

    public static int vx0(Intent intent) {
        if (intent == null) {
            return 0;
        }
        int intExtra = intent.getIntExtra("CONTACT_INFO_UI_SOURCE", 0);
        Log.m105918d("MicroMsg.SubCoreProfile", "[getPrefixAddScene] source:" + intExtra);
        return intExtra;
    }

    public static C34235a wx0() {
        Class cls = C42599h.class;
        C86709a0.m107523b().mo121108c();
        C42599h hVar = (C42599h) C86312j.m106911c(cls);
        if (hVar.f115277d == null && C86709a0.m107522a()) {
            synchronized (cls) {
                if (hVar.f115277d == null) {
                    hVar.f115277d = new C34235a(C97625j3.m125812b().mo105909x());
                }
            }
        }
        return hVar.f115277d;
    }

    public static void xx0(Intent intent, int i, int i2, String str) {
        ((C119157j) C119157j.f356862d).mo183878i(new C42600a(intent, i, i2, str), 100);
    }
}
