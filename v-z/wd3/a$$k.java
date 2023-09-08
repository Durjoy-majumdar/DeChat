package wd3;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75597w2;
import java.util.LinkedList;

public class a$$k implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ C72996z1 f230062a;

    /* renamed from: b */
    public final /* synthetic */ String f230063b;

    /* renamed from: c */
    public final /* synthetic */ String f230064c;

    /* renamed from: d */
    public final /* synthetic */ LinkedList f230065d;

    /* renamed from: e */
    public final /* synthetic */ C78543a f230066e;

    public a$$k(C78543a aVar, C72996z1 z1Var, String str, String str2, LinkedList linkedList) {
        this.f230066e = aVar;
        this.f230062a = z1Var;
        this.f230063b = str;
        this.f230064c = str2;
        this.f230065d = linkedList;
    }

    /* renamed from: a */
    public void mo1109a(String str, boolean z) {
        C72996z1 z1Var = this.f230062a;
        String str2 = "";
        if (z1Var != null) {
            str2 = Util.nullAs(z1Var.f149527Z0, str2);
        }
        this.f230066e.mo108509l(str2);
        this.f230066e.mo108500a(this.f230063b, this.f230064c, this.f230065d);
    }
}
