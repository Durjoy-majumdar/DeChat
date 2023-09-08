package com.tencent.p014mm.p136ui.conversation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import qe3.C12212g;
import qo3.C77398g;
import wc3.C90945m;

/* renamed from: com.tencent.mm.ui.conversation.i2 */
public final class C6964i2 {

    /* renamed from: a */
    public static C77398g f24671a;

    /* renamed from: com.tencent.mm.ui.conversation.i2$a */
    public class C6965a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SharedPreferences f24672d;

        /* renamed from: e */
        public final /* synthetic */ Context f24673e;

        /* renamed from: f */
        public final /* synthetic */ boolean f24674f;

        /* renamed from: g */
        public final /* synthetic */ int f24675g;

        /* renamed from: h */
        public final /* synthetic */ int f24676h;

        public C6965a(SharedPreferences sharedPreferences, Context context, boolean z, int i, int i2) {
            this.f24672d = sharedPreferences;
            this.f24673e = context;
            this.f24674f = z;
            this.f24675g = i;
            this.f24676h = i2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f24672d.edit().putInt("show_rating_flag", 4).commit();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=" + MMApplicationContext.getPackageName()));
            Context context = this.f24673e;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/conversation/RatingDialogHelper$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/ui/conversation/RatingDialogHelper$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            Log.m105918d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]start market intent");
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            this.f24672d.edit().putBoolean("show_rating_again", false).commit();
            C6964i2.f24671a = null;
            if (this.f24674f) {
                C115669n.INSTANCE.mo160131h(11216, 5, Integer.valueOf(this.f24675g), Integer.valueOf(this.f24676h));
                return;
            }
            C115669n.INSTANCE.mo160131h(11216, 4, Integer.valueOf(this.f24675g), Integer.valueOf(this.f24676h));
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.i2$b */
    public class C6966b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SharedPreferences f24677d;

        /* renamed from: e */
        public final /* synthetic */ boolean f24678e;

        /* renamed from: f */
        public final /* synthetic */ int f24679f;

        /* renamed from: g */
        public final /* synthetic */ int f24680g;

        public C6966b(SharedPreferences sharedPreferences, boolean z, int i, int i2) {
            this.f24677d = sharedPreferences;
            this.f24678e = z;
            this.f24679f = i;
            this.f24680g = i2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f24677d.edit().putInt("show_rating_flag", 4).commit();
            if (this.f24678e) {
                this.f24677d.edit().putBoolean("show_rating_again", false).commit();
                C115669n.INSTANCE.mo160131h(11216, 3, Integer.valueOf(this.f24679f), Integer.valueOf(this.f24680g));
            } else {
                Log.m105918d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]need to show rating dialog again.");
                this.f24677d.edit().putBoolean("show_rating_again", true).commit();
                C115669n.INSTANCE.mo160131h(11216, 6, Integer.valueOf(this.f24679f), Integer.valueOf(this.f24680g));
            }
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            C6964i2.f24671a = null;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.i2$c */
    public class C6967c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SharedPreferences f24681d;

        /* renamed from: e */
        public final /* synthetic */ Context f24682e;

        /* renamed from: f */
        public final /* synthetic */ int f24683f;

        /* renamed from: g */
        public final /* synthetic */ int f24684g;

        public C6967c(SharedPreferences sharedPreferences, Context context, int i, int i2) {
            this.f24681d = sharedPreferences;
            this.f24682e = context;
            this.f24683f = i;
            this.f24684g = i2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f24681d.edit().putInt("show_rating_flag", 4).commit();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            C90945m.m114063m(this.f24682e, "weixin://dl/feedback", (Intent) null, 0, (Bundle) null, C12212g.m11775a(), new byte[0], (String) null);
            C6964i2.f24671a = null;
            C115669n.INSTANCE.mo160131h(11216, 2, Integer.valueOf(this.f24683f), Integer.valueOf(this.f24684g));
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.i2$d */
    public class C6968d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SharedPreferences f24685d;

        /* renamed from: e */
        public final /* synthetic */ int f24686e;

        /* renamed from: f */
        public final /* synthetic */ int f24687f;

        public C6968d(SharedPreferences sharedPreferences, int i, int i2) {
            this.f24685d = sharedPreferences;
            this.f24686e = i;
            this.f24687f = i2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f24685d.edit().putInt("show_rating_flag", 4).commit();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            C6964i2.f24671a = null;
            C115669n.INSTANCE.mo160131h(11216, 1, Integer.valueOf(this.f24686e), Integer.valueOf(this.f24687f));
        }
    }

    /* renamed from: a */
    public static void m7231a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("show_rating_preferences", 0);
        int i = sharedPreferences.getInt("show_rating_wait_days", 0);
        int i2 = sharedPreferences.getInt("show_rating_first_second_time", 0);
        f24671a = C76879j.m92717K(context, false, context.getString(C0966R.string.j7y), "", context.getString(C0966R.string.j7x), context.getString(C0966R.string.j7w), new C6967c(sharedPreferences, context, i2, i), new C6968d(sharedPreferences, i2, i));
    }

    /* renamed from: b */
    public static void m7232b(Context context, boolean z) {
        String str;
        String str2;
        String str3;
        Context context2 = context;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("show_rating_preferences", 0);
        boolean z2 = sharedPreferences.getBoolean("show_rating_again", false);
        int i = sharedPreferences.getInt("show_rating_wait_days", 0);
        int i2 = sharedPreferences.getInt("show_rating_first_second_time", 0);
        if (z) {
            str3 = context2.getString(C0966R.string.j7u);
            str2 = context2.getString(C0966R.string.j7t);
            str = context2.getString(C0966R.string.j7s);
        } else {
            str3 = context2.getString(C0966R.string.j7r);
            str2 = context2.getString(C0966R.string.j7q);
            str = context2.getString(C0966R.string.j7p);
        }
        f24671a = C76879j.m92717K(context, false, str3, "", str2, str, new C6965a(sharedPreferences, context, z2, i2, i), new C6966b(sharedPreferences, z2, i2, i));
    }
}
