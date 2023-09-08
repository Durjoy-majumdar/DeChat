package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import b63.C67183e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e63.C75556b;
import g63.C75886j;
import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;
import p755xs.C102720b;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.w */
public class C71858w implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f208416d;

    /* renamed from: e */
    public final /* synthetic */ WalletBalanceSaveUI f208417e;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.w$a */
    public class C71859a implements C102720b.C78973a {

        /* renamed from: d */
        public final /* synthetic */ String f208418d;

        /* renamed from: e */
        public final /* synthetic */ C76874e0 f208419e;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.w$a$a */
        public class C71860a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f208421d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f208422e;

            public C71860a(String str, Bitmap bitmap) {
                this.f208421d = str;
                this.f208422e = bitmap;
            }

            public void run() {
                Log.m105925i("MicroMsg.WalletBalanceSaveUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", this.f208421d, C71859a.this.f208418d);
                if (C71858w.this.f208417e.f207851z.containsKey(this.f208421d)) {
                    int intValue = C71858w.this.f208417e.f207851z.get(this.f208421d).intValue();
                    if (C71859a.this.f208419e.getItem(intValue) != null) {
                        C71859a.this.f208419e.getItem(intValue).setIcon(new BitmapDrawable(BitmapUtil.extractThumbNail(this.f208422e, C71858w.this.f208417e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), C71858w.this.f208417e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), true, false)));
                        C71858w.this.f208417e.f207845t.mo106727b();
                    }
                }
            }
        }

        public C71859a(String str, C76874e0 e0Var) {
            this.f208418d = str;
            this.f208419e = e0Var;
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            MMHandlerThread.postToMainThread(new C71860a(str, bitmap));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.w$b */
    public class C71861b extends C72478z {
        public C71861b(C71858w wVar, Context context) {
            super(context);
        }

        public void onClick(View view) {
        }
    }

    public C71858w(WalletBalanceSaveUI walletBalanceSaveUI, List list) {
        this.f208417e = walletBalanceSaveUI;
        this.f208416d = list;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        SpannableString spannableString;
        Bitmap bitmap;
        char c;
        Bitmap bitmap2;
        int i;
        Class cls = C102720b.class;
        int size = this.f208416d.size();
        for (int i2 = 0; i2 < size; i2++) {
            Bankcard bankcard = (Bankcard) this.f208416d.get(i2);
            C67183e c2 = C75556b.m90593c(this.f208417e, bankcard.field_bankcardType, bankcard.mo99394u2());
            String str = "";
            String str2 = c2 != null ? c2.f192875a : str;
            Bitmap N6 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(new C75886j(str2));
            ((C102720b) C86312j.m106911c(cls)).Lu0(new C71859a(str2, e0Var));
            if (!Util.isNullOrNil(bankcard.field_forbidWord)) {
                str = bankcard.field_forbidWord;
            }
            if (Util.isNullOrNil(bankcard.field_forbid_title)) {
                spannableString = new SpannableString(str);
            } else {
                str = str + " ";
                spannableString = new SpannableString(str + bankcard.field_forbid_title);
                C71861b bVar = new C71861b(this, this.f208417e);
                int length = str.length();
                int length2 = str.length() + bankcard.field_forbid_title.length();
                spannableString.setSpan(new ForegroundColorSpan(this.f208417e.getResources().getColor(C0966R.color.ajt)), length, length2, 33);
                spannableString.setSpan(bVar, length, length2, 33);
            }
            if (Util.isNullOrNil((CharSequence) spannableString)) {
                spannableString = new SpannableString(bankcard.field_avail_save_wording);
            }
            String str3 = bankcard.field_desc;
            if (bankcard.mo99388n2()) {
                Log.m105925i("MicroMsg.WalletBalanceSaveUI", "i %d fee %s %s", Integer.valueOf(i2), str3, spannableString);
                e0Var.mo107159q(i2, str3, spannableString, this.f208417e.getResources().getDrawable(C0966R.C0969drawable.cek), !Util.isNullOrNil(str));
                bitmap = null;
            } else {
                if (N6 != null) {
                    c = 0;
                    bitmap2 = BitmapUtil.extractThumbNail(N6, this.f208417e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), this.f208417e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), true, false);
                    i = 3;
                } else {
                    c = 0;
                    i = 3;
                    bitmap2 = null;
                }
                Object[] objArr = new Object[i];
                objArr[c] = Integer.valueOf(i2);
                objArr[1] = str3;
                objArr[2] = spannableString;
                Log.m105925i("MicroMsg.WalletBalanceSaveUI", "i %d fee %s %s", objArr);
                e0Var.mo107156p(i2, str3, spannableString, bitmap2 == null ? null : new BitmapDrawable(bitmap2), 0, !Util.isNullOrNil(str));
                bitmap = bitmap2;
            }
            if (bitmap == null) {
                this.f208417e.f207851z.put(str2, Integer.valueOf(i2));
            }
        }
    }
}
