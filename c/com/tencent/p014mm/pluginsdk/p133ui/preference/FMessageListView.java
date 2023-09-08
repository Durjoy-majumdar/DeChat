package com.tencent.p014mm.pluginsdk.p133ui.preference;

import ae3.C67030b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.preference.C72893b;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72956b4;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72991u4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import fd0.C75743h;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.FMessageListView */
public class FMessageListView extends LinearLayout {

    /* renamed from: d */
    public final MStorage.IOnStorageChange f212388d;

    /* renamed from: e */
    public MStorage.IOnStorageChange f212389e;

    /* renamed from: f */
    public MStorage.IOnStorageChange f212390f;

    /* renamed from: g */
    public Context f212391g;

    /* renamed from: h */
    public C72893b.C72895b f212392h;

    /* renamed from: i */
    public final LinearLayout.LayoutParams f212393i;

    /* renamed from: j */
    public C72882e f212394j;

    /* renamed from: n */
    public C72893b f212395n;

    /* renamed from: o */
    public TextView f212396o;

    /* renamed from: p */
    public boolean f212397p;

    /* renamed from: q */
    public C72893b.C72896c f212398q;

    /* renamed from: r */
    public boolean f212399r;

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.FMessageListView$a */
    public class C72877a implements MStorage.IOnStorageChange {
        public C72877a() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            long j;
            FMessageListView fMessageListView = FMessageListView.this;
            if (!fMessageListView.f212397p) {
                fMessageListView.getClass();
                if (str == null || str.length() == 0) {
                    Log.m105920e("MicroMsg.FMessageListView", "updateLbs, id is null");
                    return;
                }
                try {
                    j = Util.getLong(str, 0);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.FMessageListView", "updateLbs, id = " + str + ", ex = " + e.getMessage());
                    j = 0;
                }
                if (j == 0) {
                    Log.m105920e("MicroMsg.FMessageListView", "updateLbs fail, sysRowId is invalid");
                    return;
                }
                Log.m105918d("MicroMsg.FMessageListView", "updateLbs succ, sysRowId = " + j);
                C72956b4 b4Var = new C72956b4();
                if (!C75743h.xx0().get(j, b4Var)) {
                    Log.m105920e("MicroMsg.FMessageListView", "updateLbs, get fail, id = " + j);
                    return;
                }
                C72893b.C72895b bVar = fMessageListView.f212392h;
                if (bVar == null || !bVar.f212466a.equals(b4Var.field_sayhiuser)) {
                    Log.m105918d("MicroMsg.FMessageListView", "updateLbs, other talker, no need to process");
                    return;
                }
                String str2 = fMessageListView.f212392h.f212468c;
                if (str2 != null && str2.length() > 0) {
                    fMessageListView.setVisibility(0);
                }
                fMessageListView.mo100718a(C67030b.m79189d(fMessageListView.f212391g, b4Var));
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.FMessageListView$b */
    public class C72878b implements MStorage.IOnStorageChange {
        public C72878b() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            long j;
            FMessageListView fMessageListView = FMessageListView.this;
            if (!fMessageListView.f212397p) {
                fMessageListView.getClass();
                if (str == null || str.length() == 0) {
                    Log.m105920e("MicroMsg.FMessageListView", "updateFMsg, id is null");
                    return;
                }
                try {
                    j = Util.getLong(str, 0);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.FMessageListView", "updateFMsg, id = " + str + ", ex = " + e.getMessage());
                    j = 0;
                }
                if (j == 0) {
                    Log.m105920e("MicroMsg.FMessageListView", "updateFMsg fail, sysRowId is invalid");
                    return;
                }
                Log.m105918d("MicroMsg.FMessageListView", "updateFMsg succ, sysRowId = " + j);
                C72985m3 m3Var = new C72985m3();
                if (!C75743h.wx0().get(j, m3Var)) {
                    Log.m105920e("MicroMsg.FMessageListView", "updateFMsg, get fail, id = " + j);
                    return;
                }
                C72893b.C72895b bVar = fMessageListView.f212392h;
                if (bVar == null || !bVar.f212466a.equals(m3Var.field_talker)) {
                    Log.m105918d("MicroMsg.FMessageListView", "updateFMsg, other talker, no need to process");
                    return;
                }
                String str2 = fMessageListView.f212392h.f212468c;
                if (str2 != null && str2.length() > 0) {
                    fMessageListView.setVisibility(0);
                }
                fMessageListView.mo100718a(C67030b.m79187b(fMessageListView.f212391g, m3Var));
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.FMessageListView$c */
    public class C72879c implements MStorage.IOnStorageChange {
        public C72879c() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            long j;
            FMessageListView fMessageListView = FMessageListView.this;
            if (!fMessageListView.f212397p) {
                fMessageListView.getClass();
                if (str == null || str.length() == 0) {
                    Log.m105920e("MicroMsg.FMessageListView", "updateShake, id is null");
                    return;
                }
                try {
                    j = Util.getLong(str, 0);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.FMessageListView", "updateShake, id = " + str + ", ex = " + e.getMessage());
                    j = 0;
                }
                if (j == 0) {
                    Log.m105920e("MicroMsg.FMessageListView", "updateShake fail, sysRowId is invalid");
                    return;
                }
                Log.m105918d("MicroMsg.FMessageListView", "updateShake succ, sysRowId = " + j);
                C72991u4 u4Var = new C72991u4();
                if (!C75743h.yx0().get(j, u4Var)) {
                    Log.m105920e("MicroMsg.FMessageListView", "updateShake, get fail, id = " + j);
                    return;
                }
                C72893b.C72895b bVar = fMessageListView.f212392h;
                if (bVar == null || !bVar.f212466a.equals(u4Var.field_sayhiuser)) {
                    Log.m105918d("MicroMsg.FMessageListView", "updateShake, other talker, no need to process");
                    return;
                }
                String str2 = fMessageListView.f212392h.f212468c;
                if (str2 != null && str2.length() > 0) {
                    fMessageListView.setVisibility(0);
                }
                fMessageListView.mo100718a(C67030b.m79188c(fMessageListView.f212391g, u4Var));
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.FMessageListView$d */
    public class C72880d implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C67030b f212403d;

        /* renamed from: com.tencent.mm.pluginsdk.ui.preference.FMessageListView$d$a */
        public class C72881a implements C76879j.C11180n {
            public C72881a() {
            }

            /* renamed from: j */
            public void mo782j(int i) {
                if (i == 0) {
                    ClipboardHelper.setText(C72880d.this.f212403d.f192525b);
                }
            }
        }

        public C72880d(C67030b bVar) {
            this.f212403d = bVar;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/preference/FMessageListView$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Log.m105918d("MicroMsg.FMessageListView", "jacks long click digest");
            C76879j.m92734e(FMessageListView.this.getContext(), (String) null, new String[]{FMessageListView.this.getContext().getString(C0966R.string.b7h)}, (String) null, (String) null, new C72881a());
            C117292a.m165362h(true, this, "com/tencent/mm/pluginsdk/ui/preference/FMessageListView$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.FMessageListView$e */
    public static class C72882e extends View {
        public C72882e(Context context) {
            super(context);
            setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        }
    }

    public FMessageListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo100718a(C67030b bVar) {
        String str;
        String str2;
        if (bVar == null) {
            Log.m105920e("MicroMsg.FMessageListView", "addItem fail, provider is null");
        } else if (bVar.f192528e <= 0) {
            Log.m105920e("MicroMsg.FMessageListView", "addItem fail, systemRowId invalid = " + bVar.f192528e);
        } else {
            int childCount = getChildCount();
            boolean z = true;
            int i = 1;
            while (i < childCount) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof C72893b) || childAt.getTag() == null || !childAt.getTag().equals(Long.valueOf(bVar.f192528e))) {
                    i++;
                } else {
                    Log.m105928w("MicroMsg.FMessageListView", "addItem, item repeated, sysRowId = " + bVar.f192528e);
                    return;
                }
            }
            if (bVar.f192530g != null) {
                if (this.f212396o == null) {
                    this.f212396o = (TextView) findViewById(C0966R.C0970id.bnr);
                }
                this.f212396o.setText(bVar.f192530g);
                this.f212396o.setVisibility(0);
            }
            Log.m105918d("MicroMsg.FMessageListView", "addItem, current child count = " + childCount);
            if (childCount == 6) {
                Log.m105924i("MicroMsg.FMessageListView", "addItem, most 3 FMessageItemView, remove earliest");
                removeViewAt(1);
            }
            if (childCount == 1) {
                Log.m105918d("MicroMsg.FMessageListView", "addItem, current child count is 0, add two child view");
                C72882e eVar = new C72882e(this.f212391g);
                this.f212394j = eVar;
                addView(eVar);
                C72893b bVar2 = new C72893b(this.f212391g);
                this.f212395n = bVar2;
                bVar2.setGotoSayHiCallBack(this.f212398q);
                this.f212395n.setContentText("");
                Log.m105925i("MicroMsg.FMessageListView", "addItem, isForceHideReply = %s.", Boolean.valueOf(this.f212399r));
                if (this.f212399r) {
                    this.f212395n.setBtnVisibility(8);
                } else {
                    this.f212395n.setBtnVisibility(0);
                }
                addView(this.f212395n, this.f212393i);
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(bVar.f192524a);
                if (z1Var == null || !z1Var.mo62927s3()) {
                    Log.m105918d("MicroMsg.FMessageListView", "addItem, reply btn visible, talker = " + bVar.f192524a);
                    this.f212394j.setVisibility(0);
                    this.f212395n.setVisibility(0);
                } else {
                    Log.m105918d("MicroMsg.FMessageListView", "addItem, reply btn gone, talker = " + bVar.f192524a);
                    this.f212394j.setVisibility(8);
                    this.f212395n.setVisibility(8);
                }
            }
            if (bVar.f192529f) {
                str = this.f212391g.getString(C0966R.string.exy, new Object[]{bVar.f192525b});
                z = false;
            } else {
                String str3 = bVar.f192527d;
                if (str3 == null || str3.length() <= 0) {
                    str2 = bVar.f192524a;
                    C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(bVar.f192524a);
                    if (z1Var2 != null && ((int) z1Var2.f108320R1) > 0) {
                        str2 = z1Var2.mo62898f();
                    }
                } else {
                    str2 = bVar.f192527d;
                }
                str = str2 + ": " + bVar.f192525b;
            }
            C72893b bVar3 = new C72893b(this.f212391g);
            bVar3.setTag(Long.valueOf(bVar.f192528e));
            bVar3.setContentText(str);
            bVar3.setBtnVisibility(8);
            if (z) {
                bVar3.setOnLongClickListener(new C72880d(bVar));
            }
            addView(bVar3, getChildCount() - 2, this.f212393i);
        }
    }

    /* renamed from: b */
    public void mo100719b() {
        C75743h.wx0().remove(this.f212389e);
        C75743h.xx0().remove(this.f212389e);
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96099XB().remove(this.f212388d);
        C75743h.yx0().remove(this.f212390f);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C72893b) {
                C72893b bVar = (C72893b) childAt;
                bVar.getClass();
                C97625j3.m125815e().mo123470p(30, bVar);
                C89779i0 i0Var = bVar.f212463g;
                if (i0Var != null && i0Var.isShowing()) {
                    bVar.f212463g.dismiss();
                }
            }
        }
        this.f212394j = null;
        this.f212395n = null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C75743h.wx0().add(this.f212389e);
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96099XB().add(this.f212388d);
        C75743h.xx0().add(this.f212389e);
        C75743h.yx0().add(this.f212390f);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo100719b();
    }

    public void setFMessageArgs(C72893b.C72895b bVar) {
        this.f212392h = bVar;
        C72893b.setFMessageArgs(bVar);
    }

    public void setForceHideReply(boolean z) {
        this.f212399r = z;
        Log.m105925i("MicroMsg.FMessageListView", "setForceHideReply = %s, stack = ", Boolean.valueOf(z), Util.getStack());
    }

    public void setGotoSayHiCallBack(C72893b.C72896c cVar) {
        this.f212398q = cVar;
    }

    public void setHide(boolean z) {
        this.f212397p = z;
    }

    public void setReplyBtnVisible(boolean z) {
        int childCount = getChildCount();
        Log.m105918d("MicroMsg.FMessageListView", "setReplyBtnVisible, visible = " + z + ", current child count = " + childCount);
        if (childCount <= 2) {
            Log.m105920e("MicroMsg.FMessageListView", "setReplyBtnVisible fail, childCount invalid = " + childCount);
            return;
        }
        C72882e eVar = this.f212394j;
        int i = 0;
        if (eVar != null) {
            eVar.setVisibility(z ? 0 : 8);
        }
        C72893b bVar = this.f212395n;
        if (bVar != null) {
            if (!z) {
                i = 8;
            }
            bVar.setVisibility(i);
        }
    }

    public FMessageListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f212388d = new C72877a();
        this.f212389e = new C72878b();
        this.f212390f = new C72879c();
        this.f212393i = new LinearLayout.LayoutParams(-1, -2);
        this.f212397p = false;
        this.f212399r = false;
        this.f212391g = context;
    }
}
