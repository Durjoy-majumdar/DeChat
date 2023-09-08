package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashSet;
import java.util.List;
import p240sx.C77805n;

/* renamed from: com.tencent.mm.ui.contact.r1 */
public class C74554r1 extends C74551q1 {

    /* renamed from: n */
    public HashSet<String> f219153n = new HashSet<>();

    /* renamed from: com.tencent.mm.ui.contact.r1$a */
    public class C74555a implements C77805n.C77806a {
        public C74555a() {
        }
    }

    public C74554r1(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, String str) {
        super(mMBaseSelectContactUI, list, z, 0);
        if (!Util.isNullOrNil(str)) {
            this.f219153n.addAll(Util.stringsToList(str.split(",")));
            Log.m105925i("MicroMsg.MMSearchSportContactAdapter", "matchUsernameSet %s", Integer.valueOf(this.f219153n.size()));
        }
        ((C77805n) this.f219151j).mo107750a(new C74555a());
    }
}
