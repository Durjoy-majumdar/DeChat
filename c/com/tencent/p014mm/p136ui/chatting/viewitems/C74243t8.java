package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.os.Bundle;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72829t0;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C72963f4;
import uj3.C78208e;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.t8 */
public class C74243t8 extends C72829t0 {

    /* renamed from: A */
    public long f217949A;

    /* renamed from: B */
    public int f217950B;

    /* renamed from: C */
    public int f217951C;

    /* renamed from: D */
    public String f217952D;

    /* renamed from: E */
    public Bundle f217953E;

    /* renamed from: F */
    public C19623o0 f217954F;

    /* renamed from: G */
    public int f217955G;

    /* renamed from: H */
    public String f217956H;

    /* renamed from: I */
    public String f217957I;

    /* renamed from: J */
    public int f217958J;

    /* renamed from: K */
    public String f217959K;

    /* renamed from: L */
    public Bundle f217960L;

    /* renamed from: M */
    public String f217961M;

    /* renamed from: N */
    public String f217962N;

    /* renamed from: O */
    public String f217963O;

    /* renamed from: P */
    public int f217964P;

    /* renamed from: Q */
    public int f217965Q;

    /* renamed from: R */
    public String f217966R;

    /* renamed from: S */
    public String f217967S;

    /* renamed from: b */
    public String f217968b;

    /* renamed from: c */
    public boolean f217969c;

    /* renamed from: d */
    public C78208e f217970d;

    /* renamed from: e */
    public String f217971e;

    /* renamed from: f */
    public String f217972f;

    /* renamed from: g */
    public String f217973g;

    /* renamed from: h */
    public String f217974h;

    /* renamed from: i */
    public String f217975i;

    /* renamed from: j */
    public boolean f217976j;

    /* renamed from: k */
    public boolean f217977k;

    /* renamed from: l */
    public int f217978l;

    /* renamed from: m */
    public String f217979m;

    /* renamed from: n */
    public String f217980n;

    /* renamed from: o */
    public int f217981o;

    /* renamed from: p */
    public String f217982p;

    /* renamed from: q */
    public String f217983q;

    /* renamed from: r */
    public String f217984r;

    /* renamed from: s */
    public String f217985s;

    /* renamed from: t */
    public int f217986t;

    /* renamed from: u */
    public String f217987u;

    /* renamed from: v */
    public String f217988v;

    /* renamed from: w */
    public C68070l.C68072b f217989w;

    /* renamed from: x */
    public String f217990x;

    /* renamed from: y */
    public int f217991y;

    /* renamed from: z */
    public String f217992z;

    public C74243t8() {
        this.f217991y = 0;
        this.f217951C = 0;
        this.f217955G = -1;
    }

    /* renamed from: a */
    public static C74243t8 m88488a(String str) {
        C74243t8 t8Var = new C74243t8();
        t8Var.f217988v = str;
        return t8Var;
    }

    /* renamed from: b */
    public int mo103252b() {
        C78208e eVar = this.f217970d;
        if (eVar != null) {
            return eVar.getAdapterPosition();
        }
        return 0;
    }

    public C74243t8(C72963f4 f4Var, boolean z, C78208e eVar, String str, boolean z2, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8) {
        this.f217991y = 0;
        this.f217951C = 0;
        this.f217955G = -1;
        this.f212238a = f4Var;
        this.f217969c = z;
        this.f217970d = eVar;
        this.f217968b = str;
        this.f217972f = str3;
        this.f217973g = str4;
        this.f217974h = str5;
        this.f217978l = i;
        this.f217979m = str6;
        this.f217980n = str7;
        this.f217988v = str8;
    }

    public C74243t8(C72963f4 f4Var, boolean z, C78208e eVar, String str, boolean z2, String str2, String str3, String str4, String str5, String str6, String str7, boolean z3, boolean z4) {
        this.f217991y = 0;
        this.f217951C = 0;
        this.f217955G = -1;
        this.f212238a = f4Var;
        this.f217969c = z;
        this.f217970d = eVar;
        this.f217968b = str;
        this.f217972f = str3;
        this.f217973g = str4;
        this.f217974h = str5;
        this.f217975i = str6;
        this.f217988v = str7;
        this.f217976j = z3;
        this.f217977k = z4;
    }

    public C74243t8(C72963f4 f4Var, boolean z, C78208e eVar, String str, boolean z2, String str2, String str3, String str4, String str5) {
        this(f4Var, z, eVar, str, z2, str2, str3, str4, str5, (String) null, (String) null, false, false);
    }

    public C74243t8(C72963f4 f4Var, boolean z, C78208e eVar, String str, boolean z2, String str2, String str3, String str4) {
        this(f4Var, z, eVar, str, z2, str2, str3, str4, (String) null);
    }

    public C74243t8(C72963f4 f4Var, boolean z, C78208e eVar, String str, boolean z2) {
        this(f4Var, z, eVar, str, z2, (String) null, (String) null, (String) null);
    }

    public C74243t8(C72963f4 f4Var, boolean z, C78208e eVar, String str) {
        this(f4Var, z, eVar, str, false);
    }

    public C74243t8(C72963f4 f4Var, boolean z, C78208e eVar, String str, String str2) {
        this(f4Var, z, eVar, str, false);
        this.f217971e = str2;
    }

    public C74243t8(C72963f4 f4Var, String str) {
        this.f217991y = 0;
        this.f217951C = 0;
        this.f217955G = -1;
        this.f217968b = str;
        this.f212238a = f4Var;
    }

    public C74243t8(String str, String str2) {
        this.f217991y = 0;
        this.f217951C = 0;
        this.f217955G = -1;
        this.f217968b = str;
        this.f217971e = str2;
    }

    public C74243t8(C72963f4 f4Var, String str, String str2) {
        this.f217991y = 0;
        this.f217951C = 0;
        this.f217955G = -1;
        this.f217968b = str;
        this.f212238a = f4Var;
        this.f217952D = str2;
    }
}
