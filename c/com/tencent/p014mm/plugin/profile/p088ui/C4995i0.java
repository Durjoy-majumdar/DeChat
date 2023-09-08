package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C68092j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p196ln.C61311l;
import p196ln.C76706g;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.profile.ui.i0 */
public class C4995i0 implements C61311l.C61312a {

    /* renamed from: a */
    public final /* synthetic */ C68092j f20291a;

    /* renamed from: b */
    public final /* synthetic */ String f20292b;

    /* renamed from: c */
    public final /* synthetic */ String f20293c;

    /* renamed from: d */
    public final /* synthetic */ ContactSocialInfoUI f20294d;

    public C4995i0(ContactSocialInfoUI contactSocialInfoUI, C68092j jVar, String str, String str2) {
        this.f20294d = contactSocialInfoUI;
        this.f20291a = jVar;
        this.f20292b = str;
        this.f20293c = str2;
    }

    /* renamed from: a */
    public int mo1218a(int i, int i2) {
        this.f20291a.mo86278a();
        Log.m105925i("MicroMsg.ContactSocialInfoUI", "onSceneEnd: errType=%d, errCode=%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            Bitmap k = ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93562k(this.f20292b);
            ContactSocialInfoUI contactSocialInfoUI = this.f20294d;
            String str = this.f20293c;
            int i3 = ContactSocialInfoUI.f20186s;
            if (contactSocialInfoUI.mo5908J7(str, k)) {
                C76701a.makeText((Context) this.f20294d.getContext(), (CharSequence) this.f20294d.getContext().getString(C0966R.string.bqe), 0).show();
                return 0;
            }
        }
        C76701a.makeText((Context) this.f20294d.getContext(), (CharSequence) this.f20294d.getContext().getString(C0966R.string.bqc), 0).show();
        return 0;
    }
}
