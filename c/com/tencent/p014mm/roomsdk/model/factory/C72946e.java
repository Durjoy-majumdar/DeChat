package com.tencent.p014mm.roomsdk.model.factory;

import mg3.C47024a;
import ng3.C76856a;
import ob0.C11385n;
import ob0.C117747y;
import pg3.C77084b;

/* renamed from: com.tencent.mm.roomsdk.model.factory.e */
public class C72946e implements C47024a {

    /* renamed from: a */
    public int f212625a;

    /* renamed from: b */
    public C77084b f212626b;

    /* renamed from: c */
    public C77084b f212627c;

    /* renamed from: d */
    public C11385n f212628d = new C72947a();

    /* renamed from: com.tencent.mm.roomsdk.model.factory.e$a */
    public class C72947a implements C11385n {
        public C72947a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (yVar instanceof C76856a) {
                C72946e.this.getClass();
                ((C76856a) yVar).mo71848e0((C77084b) null);
            }
            C72946e.this.getClass();
            if (i == 0 && i2 == 0) {
                C77084b bVar = C72946e.this.f212626b;
                if (bVar != null) {
                    bVar.mo10150a(i, i2, str, bVar);
                    return;
                }
                return;
            }
            C77084b bVar2 = C72946e.this.f212627c;
            if (bVar2 != null) {
                bVar2.mo10150a(i, i2, str, bVar2);
            }
        }
    }

    public C72946e(int i) {
        this.f212625a = i;
    }
}
