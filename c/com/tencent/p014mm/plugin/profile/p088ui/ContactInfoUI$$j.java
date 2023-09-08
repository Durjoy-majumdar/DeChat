package com.tencent.p014mm.plugin.profile.p088ui;

import android.util.ArrayMap;
import com.tencent.p014mm.storage.C72996z1;
import java.util.Map;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import q31.C118148a;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI$$j */
public class ContactInfoUI$$j implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ ContactInfoUI f202554a;

    public ContactInfoUI$$j(ContactInfoUI contactInfoUI) {
        this.f202554a = contactInfoUI;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public Map<String, Object> mo37b(String str) {
        if (this.f202554a.f202536n == null) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        int i = -1;
        if (this.f202554a.f202536n.mo62916m3()) {
            i = 0;
        } else if (!this.f202554a.f202536n.mo62927s3()) {
            i = C72996z1.m85843n5(this.f202554a.f202536n.getUsername()) ? 1 : 2;
        } else if (this.f202554a.f202536n.mo62927s3()) {
            i = C72996z1.m85843n5(this.f202554a.f202536n.getUsername()) ? 3 : 4;
        }
        arrayMap.put(PatchedFlutterActivity.EXTRA_PAGE_TYPE, Integer.valueOf(i));
        return arrayMap;
    }
}
