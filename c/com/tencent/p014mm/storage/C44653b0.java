package com.tencent.p014mm.storage;

import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import p875ci.C67379u;
import rb0.C47984k;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.storage.b0 */
public class C44653b0 {

    /* renamed from: a */
    public C30783v3 f121062a;

    public C44653b0(C30783v3 v3Var) {
        C48009v0.Nx0();
        this.f121062a = v3Var;
    }

    /* renamed from: a */
    public void mo69632a(C72976h2 h2Var, C30783v3 v3Var) {
        boolean z;
        Class cls = C75700k0.class;
        if (h2Var != null && v3Var != null && C45628s0.m50738C(h2Var.getUsername()) && !Util.isNullOrNil(h2Var.mo108782C2()) && !C72996z1.m85841l5(h2Var.mo108782C2()) && !C72996z1.m85828Z4(h2Var.mo108782C2())) {
            C44660i2 i2Var = (C44660i2) v3Var;
            C72976h2 j = i2Var.mo69771j(h2Var.mo108782C2());
            boolean z2 = false;
            Log.m105927v("MicroMsg.BizConversationStorage", "postConvExt, username = %s, parentRef = %s", h2Var.getUsername(), h2Var.mo108782C2());
            boolean z3 = !h2Var.mo108782C2().equals("officialaccounts");
            if (j == null) {
                j = new C72976h2(h2Var.mo108782C2());
                if (z3) {
                    j.mo108371j3(2097152);
                }
                z = true;
            } else {
                z = false;
            }
            if (z3 && j.mo108819m2() == 0) {
                j.mo108371j3(2097152);
                Log.m105926v("MicroMsg.BizConversationStorage", "Enterprise cvs reset attr flag!");
            }
            Log.m105925i("MicroMsg.BizConversationStorage", "enterprise cvs count is %d", Integer.valueOf(j.mo108786G2()));
            String N = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69743N(h2Var.mo108782C2());
            C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(N);
            if (Ex0 == null || Ex0.getMsgId() <= 0) {
                j.mo101162m3();
                Log.m105925i("MicroMsg.BizConversationStorage", "lastOfMsg is null or MsgId <= 0, lastConvBiz is %s", N);
            } else {
                j.mo101164o3(Ex0);
                j.mo108792M2(Ex0.mo108768t() + XVFSFile.PATH_SEPARATOR + Ex0.getContent());
                j.mo108806b3(Integer.toString(Ex0.getType()));
                if (i2Var.mo69741L() != null) {
                    PString pString = new PString();
                    PString pString2 = new PString();
                    PInt pInt = new PInt();
                    Ex0.mo108749c3(h2Var.mo108782C2());
                    Ex0.mo108732L2(j.getContent());
                    C67379u.m79740d(Ex0, pString, pString2, pInt, true);
                    j.mo108794O2(pString.value);
                    j.mo108795P2(pString2.value);
                    j.mo108801W2(pInt.value);
                }
            }
            if (z3 && i2Var.mo69740K(j.getUsername()) <= 0) {
                z2 = true;
            }
            if (z2) {
                i2Var.mo69763f(j.getUsername());
            } else if (z) {
                i2Var.mo69751W(j);
            } else {
                i2Var.mo69773k0(j, j.getUsername());
            }
        }
    }

    /* renamed from: b */
    public void mo69633b(String str) {
        C72976h2 j;
        C72963f4 Ex0;
        Class cls = C75700k0.class;
        if (str != null && C45628s0.m50738C(str) && C47984k.m53337k(str) && (j = ((C44660i2) this.f121062a).mo69771j(str)) != null && (Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69743N(str))) != null && Ex0.getMsgId() > 0) {
            j.mo101164o3(Ex0);
            j.mo108792M2(Ex0.mo108768t() + XVFSFile.PATH_SEPARATOR + Ex0.getContent());
            j.mo108806b3(Integer.toString(Ex0.getType()));
            if (((C44660i2) this.f121062a).mo69741L() != null) {
                PString pString = new PString();
                PString pString2 = new PString();
                PInt pInt = new PInt();
                Ex0.mo108749c3(str);
                Ex0.mo108732L2(j.getContent());
                C67379u.m79740d(Ex0, pString, pString2, pInt, true);
                j.mo108794O2(pString.value);
                j.mo108795P2(pString2.value);
                j.mo108801W2(pInt.value);
            } else {
                j.mo101162m3();
            }
            ((C44660i2) this.f121062a).mo69773k0(j, j.getUsername());
        }
    }
}
