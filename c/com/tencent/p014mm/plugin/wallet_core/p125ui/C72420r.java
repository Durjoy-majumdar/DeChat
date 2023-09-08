package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import b63.C67183e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import e63.C75556b;
import eb0.C75592q0;
import g63.C75886j;
import java.util.HashMap;
import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;
import p281yz.C79173v;
import p755xs.C102720b;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.r */
public class C72420r implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f210666d;

    /* renamed from: e */
    public final /* synthetic */ Context f210667e;

    /* renamed from: f */
    public final /* synthetic */ HashMap f210668f;

    /* renamed from: g */
    public final /* synthetic */ C77407n f210669g;

    /* renamed from: h */
    public final /* synthetic */ boolean f210670h;

    /* renamed from: i */
    public final /* synthetic */ boolean f210671i;

    /* renamed from: j */
    public final /* synthetic */ String f210672j;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.r$a */
    public class C72421a implements C102720b.C78973a {

        /* renamed from: d */
        public final /* synthetic */ String f210673d;

        /* renamed from: e */
        public final /* synthetic */ C76874e0 f210674e;

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.r$a$a */
        public class C72422a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f210676d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f210677e;

            public C72422a(String str, Bitmap bitmap) {
                this.f210676d = str;
                this.f210677e = bitmap;
            }

            public void run() {
                Log.m105925i("MicroMsg.WalletBankcardBottomSheetHelper", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", this.f210676d, C72421a.this.f210673d);
                if (C72420r.this.f210668f.containsKey(this.f210676d)) {
                    int intValue = ((Integer) C72420r.this.f210668f.get(this.f210676d)).intValue();
                    if (C72421a.this.f210674e.getItem(intValue) != null) {
                        C72421a.this.f210674e.getItem(intValue).setIcon(new BitmapDrawable(BitmapUtil.extractThumbNail(this.f210677e, MMApplicationContext.getResources().getDimensionPixelOffset(C0966R.dimen.atf), MMApplicationContext.getResources().getDimensionPixelOffset(C0966R.dimen.atf), true, false)));
                        C72420r.this.f210669g.mo107564i();
                    }
                }
            }
        }

        public C72421a(String str, C76874e0 e0Var) {
            this.f210673d = str;
            this.f210674e = e0Var;
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            MMHandlerThread.postToMainThread(new C72422a(str, bitmap));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.r$b */
    public class C72423b extends C72478z {

        /* renamed from: g */
        public final /* synthetic */ Bankcard f210679g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72423b(Context context, Bankcard bankcard) {
            super(context);
            this.f210679g = bankcard;
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            String str = this.f210679g.field_forbid_url;
            Log.m105925i("MicroMsg.WalletBankcardBottomSheetHelper", "go to url %s", str);
            intent.putExtra("rawUrl", str);
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            intent.putExtra("pay_channel", 1);
            C75228t.m90217J(C72420r.this.f210667e, intent);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.r$c */
    public class C72424c implements C72476y0.C72477a {

        /* renamed from: a */
        public final /* synthetic */ Bankcard f210681a;

        public C72424c(Bankcard bankcard) {
            this.f210681a = bankcard;
        }

        /* renamed from: a */
        public void mo66525a(View view) {
            C75228t.m90219L(C72420r.this.f210667e, this.f210681a.field_prompt_info_jump_url, true);
            C115669n.INSTANCE.mo160131h(20216, 4, this.f210681a.field_prompt_info_jump_url);
        }
    }

    public C72420r(List list, Context context, HashMap hashMap, C77407n nVar, boolean z, boolean z2, String str) {
        this.f210666d = list;
        this.f210667e = context;
        this.f210668f = hashMap;
        this.f210669g = nVar;
        this.f210670h = z;
        this.f210671i = z2;
        this.f210672j = str;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        C67183e eVar;
        Class cls;
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        int i;
        Class cls2 = C102720b.class;
        char c = 0;
        int i2 = 0;
        for (Bankcard bankcard : this.f210666d) {
            if (bankcard.mo99393s2()) {
                Bankcard bankcard2 = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().f192960m;
                eVar = bankcard2 != null ? bankcard2.f209427v2 : null;
            } else {
                eVar = C75556b.m90593c(this.f210667e, bankcard.field_bankcardType, bankcard.mo99394u2());
            }
            String str = "";
            String str2 = eVar != null ? eVar.f192875a : str;
            Object[] objArr = new Object[1];
            objArr[c] = str2;
            Log.m105919d("MicroMsg.WalletBankcardBottomSheetHelper", "logo url: %s", objArr);
            Bitmap N6 = ((C102720b) C86312j.m106911c(cls2)).mo142104N6(new C75886j(str2));
            ((C102720b) C86312j.m106911c(cls2)).Lu0(new C72421a(str2, e0Var));
            if (!Util.isNullOrNil(bankcard.field_forbidWord)) {
                str = bankcard.field_forbidWord;
            }
            if (Util.isNullOrNil(bankcard.field_forbid_title)) {
                spannableStringBuilder = new SpannableStringBuilder(str);
                cls = cls2;
            } else {
                str = str + " ";
                spannableStringBuilder = new SpannableStringBuilder(str + bankcard.field_forbid_title);
                C72423b bVar = new C72423b(this.f210667e, bankcard);
                int length = str.length();
                int length2 = str.length() + bankcard.field_forbid_title.length();
                cls = cls2;
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f210667e.getResources().getColor(C0966R.color.ajt)), length, length2, 33);
                spannableStringBuilder.setSpan(bVar, length, length2, 33);
            }
            if (this.f210670h && Util.isNullOrNil((CharSequence) spannableStringBuilder) && !Util.isNullOrNil(bankcard.field_fetchArriveTimeWording)) {
                spannableStringBuilder = new SpannableStringBuilder(bankcard.field_fetchArriveTimeWording);
            }
            if (Util.isNullOrNil((CharSequence) spannableStringBuilder) || Util.isNullOrNil(bankcard.field_prompt_info_prompt_text)) {
                spannableStringBuilder2 = spannableStringBuilder;
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(bankcard.field_prompt_info_prompt_text);
                if (!Util.isNullOrNil(bankcard.field_prompt_info_jump_text) && !Util.isNullOrNil(bankcard.field_prompt_info_jump_url)) {
                    spannableStringBuilder3.append(bankcard.field_prompt_info_jump_text);
                    spannableStringBuilder3.setSpan(new C72476y0(2, (C72476y0.C72477a) new C72424c(bankcard)), bankcard.field_prompt_info_prompt_text.length(), spannableStringBuilder3.length(), 33);
                }
                spannableStringBuilder2 = spannableStringBuilder3;
            }
            String str3 = bankcard.field_desc;
            Bitmap extractThumbNail = N6 != null ? BitmapUtil.extractThumbNail(N6, this.f210667e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), this.f210667e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), true, false) : null;
            if (extractThumbNail == null) {
                this.f210668f.put(str2, Integer.valueOf(i2));
            }
            Log.m105925i("MicroMsg.WalletBankcardBottomSheetHelper", "i %d fee %s %s", Integer.valueOf(i2), str3, spannableStringBuilder2);
            if (bankcard.mo99388n2()) {
                i = i2 + 1;
                e0Var.mo107156p(i2, str3, spannableStringBuilder2, this.f210667e.getResources().getDrawable(C0966R.C0969drawable.cek), 0, !Util.isNullOrNil(str));
            } else {
                i = i2 + 1;
                e0Var.mo107156p(i2, str3, spannableStringBuilder2, extractThumbNail == null ? null : new BitmapDrawable(extractThumbNail), 0, !Util.isNullOrNil(str));
            }
            i2 = i;
            cls2 = cls;
            c = 0;
        }
        C76874e0 e0Var2 = e0Var;
        if (this.f210671i && !Util.isNullOrNil(this.f210672j)) {
            e0Var.mo107159q(i2, this.f210672j, "", MMApplicationContext.getResources().getDrawable(C0966R.C0969drawable.ceh), false);
        }
    }
}
