package com.tencent.p014mm.plugin.subapp.p109ui.openapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.tools.C7018q1;
import com.tencent.p014mm.plugin.subapp.p109ui.openapi.AppProfileUI;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import junit.framework.Assert;
import kg3.C76577a;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AppHeaderPreference */
public class AppHeaderPreference extends Preference {

    /* renamed from: J */
    public TextView f116792J;

    /* renamed from: K */
    public ImageView f116793K;

    /* renamed from: L */
    public TextView f116794L;

    /* renamed from: M */
    public TextView f116795M;

    /* renamed from: N */
    public C43174a f116796N;

    /* renamed from: P */
    public boolean f116797P = false;

    /* renamed from: Q */
    public boolean f116798Q = false;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AppHeaderPreference$a */
    public interface C43174a {
    }

    public AppHeaderPreference(Context context) {
        super(context);
    }

    /* renamed from: I */
    public void mo67399I(C43174a aVar, boolean z) {
        Assert.assertTrue(aVar != null);
        this.f116796N = aVar;
        this.f116797P = z;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        String str;
        this.f116793K = (ImageView) view.findViewById(C0966R.C0970id.bmx);
        this.f116794L = (TextView) view.findViewById(C0966R.C0970id.boq);
        this.f116792J = (TextView) view.findViewById(C0966R.C0970id.bo9);
        this.f116795M = (TextView) view.findViewById(C0966R.C0970id.bnv);
        this.f116798Q = true;
        Class cls = C79138l.class;
        C43174a aVar = this.f116796N;
        if (aVar == null) {
            Log.m105928w("MicroMsg.HeaderPreference", "initView : bindView = " + this.f116798Q);
        } else {
            AppProfileUI appProfileUI = AppProfileUI.this;
            Bitmap ub = ((C79138l) C86312j.m106911c(cls)).mo74018ub(appProfileUI.f116809d.field_appId, 1, C76577a.m92156g(appProfileUI));
            if (!(this.f116793K == null || ub == null || ub.isRecycled())) {
                this.f116793K.setImageBitmap(ub);
            }
            AppProfileUI.C43177a aVar2 = (AppProfileUI.C43177a) this.f116796N;
            aVar2.getClass();
            String hv = ((C79138l) C86312j.m106911c(cls)).mo74011hv(AppProfileUI.this.getContext(), AppProfileUI.this.f116809d);
            if (!(this.f116792J == null || hv == null || hv.length() <= 0)) {
                this.f116792J.setText(hv);
            }
            AppProfileUI.C43177a aVar3 = (AppProfileUI.C43177a) this.f116796N;
            AppCompatActivity context = AppProfileUI.this.getContext();
            C44561j jVar = AppProfileUI.this.f116809d;
            if (context == null || jVar == null) {
                str = null;
            } else {
                String l = C44565l.m48992l(context);
                str = l.equalsIgnoreCase("zh_CN") ? jVar.field_appDiscription : (l.equalsIgnoreCase("zh_TW") || l.equalsIgnoreCase("zh_HK")) ? Util.isNullOrNil(jVar.field_appDiscription_tw) ? jVar.field_appDiscription : jVar.field_appDiscription_tw : l.equalsIgnoreCase("en") ? Util.isNullOrNil(jVar.field_appDiscription_en) ? jVar.field_appDiscription : jVar.field_appDiscription_en : Util.isNullOrNil(jVar.field_appDiscription_en) ? jVar.field_appDiscription : jVar.field_appDiscription_en;
            }
            if (str != null) {
                this.f116795M.setText(str);
                this.f116795M.setVisibility(0);
            } else {
                this.f116795M.setVisibility(8);
            }
            boolean z = this.f116797P;
            if (this.f116794L != null) {
                String string = AppProfileUI.this.getContext().getString(z ? C0966R.string.iwu : C0966R.string.f361322ix1);
                if (z) {
                    if (string == null || string.length() <= 0) {
                        this.f116794L.setVisibility(8);
                    } else {
                        this.f116794L.setTextColor(C7018q1.m7264b(this.f121274d));
                        this.f116794L.setText(string);
                        this.f116794L.setCompoundDrawablesWithIntrinsicBounds(C0966R.C0969drawable.f357362bm1, 0, 0, 0);
                    }
                } else if (string == null || string.length() <= 0) {
                    this.f116794L.setVisibility(8);
                } else {
                    this.f116794L.setTextColor(C7018q1.m7263a(this.f121274d));
                    this.f116794L.setText(string);
                    this.f116794L.setCompoundDrawablesWithIntrinsicBounds(C0966R.C0969drawable.f357361bm0, 0, 0, 0);
                }
            }
        }
        super.mo1086w(view);
    }

    public AppHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
