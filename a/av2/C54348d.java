package av2;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAvatarImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.smiley.C96963p0;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import p196ln.C76705f;
import p214om.C11502f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: av2.d */
public final class C54348d extends RecyclerView.C16631z {

    /* renamed from: A */
    public final C13601g f152505A;

    /* renamed from: B */
    public final C13601g f152506B;

    /* renamed from: z */
    public final Context f152507z;

    /* renamed from: av2.d$a */
    public static final class C54349a extends C87413o implements C32224a<SnsAvatarImageView> {

        /* renamed from: d */
        public final /* synthetic */ View f152508d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54349a(View view) {
            super(0);
            this.f152508d = view;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$avatarImg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$avatarImg$2");
            SnsAvatarImageView snsAvatarImageView = (SnsAvatarImageView) this.f152508d.findViewById(C0966R.C0970id.m2b);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$avatarImg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$avatarImg$2");
            return snsAvatarImageView;
        }
    }

    /* renamed from: av2.d$b */
    public static final class C54350b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f152509d;

        /* renamed from: e */
        public final /* synthetic */ long f152510e;

        /* renamed from: f */
        public final /* synthetic */ C54348d f152511f;

        /* renamed from: g */
        public final /* synthetic */ C72996z1 f152512g;

        /* renamed from: av2.d$b$a */
        public static final class C54351a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f152513d;

            public C54351a(View view) {
                this.f152513d = view;
            }

            public final void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1$1");
                this.f152513d.setClickable(true);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1$1");
            }
        }

        public C54350b(View view, long j, C54348d dVar, C72996z1 z1Var) {
            this.f152509d = view;
            this.f152510e = j;
            this.f152511f = dVar;
            this.f152512g = z1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/sheet/ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1");
            this.f152509d.setClickable(false);
            View view2 = this.f152509d;
            view2.postDelayed(new C54351a(view2), this.f152510e);
            C54348d dVar = this.f152511f;
            String username = this.f152512g.getUsername();
            C87412m.m108593f(username, "info.username");
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("jumpToUserProfileUI", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
            Context context = dVar.f152507z;
            SnsMethodCalculate.markStartTimeMs("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            C87412m.m108594g(context, "context");
            Intent intent = new Intent();
            intent.putExtra("Contact_User", username);
            intent.putExtra("Contact_Scene", 0);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 15);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, context);
            SnsMethodCalculate.markEndTimeMs("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            SnsMethodCalculate.markEndTimeMs("jumpToUserProfileUI", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/sheet/ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: av2.d$c */
    public static final class C54352c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f152514d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54352c(View view) {
            super(0);
            this.f152514d = view;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$userTextView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$userTextView$2");
            TextView textView = (TextView) this.f152514d.findViewById(C0966R.C0970id.nnp);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$userTextView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$userTextView$2");
            return textView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54348d(View view, Context context) {
        super(view);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(context, "uiContext");
        this.f152507z = context;
        this.f152505A = C36568h.m40985a(new C54349a(view));
        this.f152506B = C36568h.m40985a(new C54352c(view));
    }

    /* renamed from: y */
    public final void mo75117y(int i) {
        SnsMethodCalculate.markStartTimeMs("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
        this.f44854d.setBackgroundResource(i);
        SnsMethodCalculate.markEndTimeMs("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
    }

    /* renamed from: z */
    public final void mo75118z(C72996z1 z1Var) {
        SnsMethodCalculate.markStartTimeMs("setContactInfo", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
        if (z1Var == null) {
            SnsMethodCalculate.markEndTimeMs("setContactInfo", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
            return;
        }
        String pv02 = ((C75339i) C86312j.m106911c(C75339i.class)).pv0(z1Var, z1Var.getUsername());
        SnsMethodCalculate.markStartTimeMs("getUserTextView", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
        Object value = ((C36570n) this.f152506B).getValue();
        C87412m.m108593f(value, "<get-userTextView>(...)");
        SnsMethodCalculate.markEndTimeMs("getUserTextView", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
        ((TextView) value).setText(C96963p0.wx0().mo83004M(MMApplicationContext.getContext(), pv02));
        SnsMethodCalculate.markStartTimeMs("getAvatarImg", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
        Object value2 = ((C36570n) this.f152505A).getValue();
        C87412m.m108593f(value2, "<get-avatarImg>(...)");
        SnsMethodCalculate.markEndTimeMs("getAvatarImg", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((SnsAvatarImageView) value2, z1Var.getUsername());
        View view = this.f44854d;
        C87412m.m108593f(view, "itemView");
        view.setOnClickListener(new C54350b(view, 1000, this, z1Var));
        SnsMethodCalculate.markEndTimeMs("setContactInfo", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
    }
}
