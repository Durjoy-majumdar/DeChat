package com.tencent.p014mm.p136ui.contact;

import a22.C67001a;
import b22.C28250a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.contact.l1 */
public class C74521l1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MMBaseSelectContactUI f219089d;

    /* renamed from: com.tencent.mm.ui.contact.l1$a */
    public class C74522a implements Runnable {
        public C74522a() {
        }

        public void run() {
            MMBaseSelectContactUI mMBaseSelectContactUI = C74521l1.this.f219089d;
            int i = MMBaseSelectContactUI.f218603B;
            mMBaseSelectContactUI.mo103387f8();
        }
    }

    public C74521l1(MMBaseSelectContactUI mMBaseSelectContactUI) {
        this.f219089d = mMBaseSelectContactUI;
    }

    public void run() {
        this.f219089d.f218623y = ((C67001a) C28250a.m38138a()).mo90967e();
        this.f219089d.f218622x = true;
        ((C119157j) C119157j.f356862d).mo183895z(new C74522a());
    }

    public String toString() {
        return super.toString() + "|updateLabelList";
    }
}
