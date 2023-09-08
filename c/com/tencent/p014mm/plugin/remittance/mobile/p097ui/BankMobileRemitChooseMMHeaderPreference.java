package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import p158gt.C76057w;
import p158gt.C8451i;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemitChooseMMHeaderPreference */
public class BankMobileRemitChooseMMHeaderPreference extends Preference {

    /* renamed from: J */
    public Map<String, C76057w.C76058a> f203832J = new HashMap();

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemitChooseMMHeaderPreference$a */
    public class C70519a implements C76057w.C76058a {

        /* renamed from: a */
        public final /* synthetic */ ImageView f203833a;

        public C70519a(BankMobileRemitChooseMMHeaderPreference bankMobileRemitChooseMMHeaderPreference, ImageView imageView) {
            this.f203833a = imageView;
        }

        /* renamed from: a */
        public void mo25933a(String str, Bitmap bitmap, String str2) {
            Log.m105925i("MicroMsg.mobileRemit.BankMobileRemitChooseMMHeaderPreference", "icon url: %s", str);
            this.f203833a.setImageBitmap(bitmap);
        }
    }

    public BankMobileRemitChooseMMHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.a5b);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.a5c);
        if (!Util.isNullOrNil((String) null)) {
            Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get((String) null);
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else if (!Util.isNullOrNil((String) null)) {
                C70519a aVar = new C70519a(this, imageView);
                ((HashMap) this.f203832J).put((Object) null, aVar);
                ((C76057w) C86312j.m106911c(C76057w.class)).h60((String) null, aVar);
            }
        } else if (!Util.isEqual(0, 0)) {
            imageView.setImageResource(0);
        }
        if (!Util.isNullOrNil((String) null)) {
            textView.setText((CharSequence) null);
        }
    }

    public BankMobileRemitChooseMMHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BankMobileRemitChooseMMHeaderPreference(Context context) {
        super(context);
    }
}
