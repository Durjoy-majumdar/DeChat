package fu2;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.autogen.events.SnsJumpPermissionSettingEvent;
import com.tencent.p014mm.autogen.events.SnsJumpProfileEvent;
import com.tencent.p014mm.autogen.events.SnsJumpReportEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import l31.C99333f;
import p773yy.C79168k;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z31.C102972b;

/* renamed from: fu2.d */
public final class C97998d extends C97987a {

    /* renamed from: h */
    public final C13601g f287401h;

    /* renamed from: i */
    public String f287402i = "";

    /* renamed from: fu2.d$a */
    public static final class C59323a extends C87413o implements C32224a<View.OnCreateContextMenuListener> {

        /* renamed from: d */
        public final /* synthetic */ C97998d f169625d;

        /* renamed from: e */
        public final /* synthetic */ Context f169626e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59323a(C97998d dVar, Context context) {
            super(0);
            this.f169625d = dVar;
            this.f169626e = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2");
            C59322c cVar = new C59322c(this.f169625d, this.f169626e);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2");
            return cVar;
        }
    }

    /* renamed from: fu2.d$b */
    public static final class C97999b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public static final C97999b f287403d = new C97999b();

        public final void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$showFeedDetailDialog$2");
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$showFeedDetailDialog$2");
        }
    }

    /* renamed from: fu2.d$c */
    public static final class C98000c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C97998d f287404d;

        /* renamed from: e */
        public final /* synthetic */ StringBuilder f287405e;

        public C98000c(C97998d dVar, StringBuilder sb) {
            this.f287404d = dVar;
            this.f287405e = sb;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$showFeedDetailDialog$3");
            Object systemService = this.f287404d.mo137309b().getSystemService("clipboard");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText((CharSequence) null, this.f287405e.toString()));
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$showFeedDetailDialog$3");
        }
    }

    /* renamed from: fu2.d$d */
    public static final class C98001d implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C97998d f287406d;

        public C98001d(C97998d dVar) {
            this.f287406d = dVar;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveAvatarClick$update$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$update$1");
            C97998d dVar = this.f287406d;
            SnsMethodCalculate.markStartTimeMs("access$showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            dVar.mo137322n();
            SnsMethodCalculate.markEndTimeMs("access$showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$update$1");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveAvatarClick$update$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97998d(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f287401h = C36568h.m40985a(new C59323a(this, context));
    }

    /* renamed from: a */
    public void mo71269a(View view) {
        SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        C98214b c = mo137310c();
        String userName = c != null ? c.getUserName() : null;
        if (userName == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            C102972b.f303874a.mo142713g(12076, "ClickAlbumCount", this.f287402i);
            return;
        }
        this.f287402i = userName;
        SnsJumpProfileEvent snsJumpProfileEvent = new SnsJumpProfileEvent();
        snsJumpProfileEvent.f265167d.f265168a = this.f287402i;
        snsJumpProfileEvent.publish();
        C98214b c2 = mo137310c();
        ((C99333f) C86312j.m106911c(C99333f.class)).mo138726rL(12076, "ClickAvatarFeedIdCount", c2 != null ? c2.mo137504B2() : "");
        ((C79168k) C86312j.m106911c(C79168k.class)).mo74109HD(this.f287402i, 6);
        SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
    }

    /* renamed from: d */
    public View.OnCreateContextMenuListener mo137311d() {
        SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        SnsMethodCalculate.markStartTimeMs("getMenuCreator", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        View.OnCreateContextMenuListener onCreateContextMenuListener = (View.OnCreateContextMenuListener) ((C36570n) this.f287401h).getValue();
        SnsMethodCalculate.markEndTimeMs("getMenuCreator", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        return onCreateContextMenuListener;
    }

    /* renamed from: i */
    public boolean mo137315i(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        C87412m.m108594g(menuItem, "menuItem");
        C98214b c = mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            return false;
        }
        String userName = c.getUserName();
        if (Util.isNullOrNil(userName)) {
            SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            return true;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            C97987a.m126563g();
            Log.m105924i("MicroMsg.Improve.Click", "click AVATER_MENU_ID_PERMISSION");
            SnsJumpPermissionSettingEvent snsJumpPermissionSettingEvent = new SnsJumpPermissionSettingEvent();
            SnsJumpPermissionSettingEvent.C92582a aVar = snsJumpPermissionSettingEvent.f265164d;
            aVar.f265165a = userName;
            aVar.f265166b = c.mo142401p2();
            snsJumpPermissionSettingEvent.publish();
        } else if (itemId == 1) {
            C97987a.m126563g();
            Log.m105924i("MicroMsg.Improve.Click", "click AVATER_MENU_ID_EXPOSE");
            SnsJumpReportEvent snsJumpReportEvent = new SnsJumpReportEvent();
            snsJumpReportEvent.f265169d.f265171b = c.mo142401p2();
            snsJumpReportEvent.f265169d.f265170a = c.getUserName();
            snsJumpReportEvent.publish();
        } else if (itemId == 2) {
            C97987a.m126563g();
            Log.m105924i("MicroMsg.Improve.Click", "click AVATER_MENU_ID_DETAIL");
            mo137322n();
        }
        SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger() == false) goto L_0x004f;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo137318m(jq3.C60905o r10, gu2.C98214b r11) {
        /*
            r9 = this;
            java.lang.String r0 = "update"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r10, r2)
            java.lang.String r2 = "info"
            gy3.C87412m.m108594g(r11, r2)
            super.mo137318m(r10, r11)
            java.lang.String r10 = r11.getUserName()
            java.lang.String r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Mx0()
            boolean r10 = gy3.C87412m.m108589b(r10, r11)
            if (r10 == 0) goto L_0x0060
            android.view.View r10 = r9.mo137314h()
            if (r10 == 0) goto L_0x002d
            r11 = 0
            r10.setOnLongClickListener(r11)
        L_0x002d:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r11 = 0
            r2 = 1
            if (r10 != 0) goto L_0x004e
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r10 != 0) goto L_0x0045
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r10 != 0) goto L_0x0045
            int r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r3 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r10 != r3) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r10 = 0
            goto L_0x0046
        L_0x0045:
            r10 = 1
        L_0x0046:
            if (r10 != 0) goto L_0x004e
            boolean r10 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r10 == 0) goto L_0x004f
        L_0x004e:
            r11 = 1
        L_0x004f:
            if (r11 == 0) goto L_0x006e
            android.view.View r10 = r9.mo137314h()
            if (r10 == 0) goto L_0x006e
            fu2.d$d r11 = new fu2.d$d
            r11.<init>(r9)
            r10.setOnLongClickListener(r11)
            goto L_0x006e
        L_0x0060:
            android.view.View r3 = r9.mo137314h()
            r4 = 1
            r5 = 1
            r6 = 0
            r7 = 8
            r8 = 0
            r2 = r9
            fu2.C97987a.m126564l(r2, r3, r4, r5, r6, r7, r8)
        L_0x006e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fu2.C97998d.mo137318m(jq3.o, gu2.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x00c6, code lost:
        r2 = r2.ContentObj;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137322n() {
        /*
            r9 = this;
            java.lang.String r0 = "showFeedDetailDialog"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            gu2.b r2 = r9.mo137310c()
            if (r2 != 0) goto L_0x0012
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0012:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "position:"
            r4.append(r5)
            int r5 = r9.mo137316j()
            r4.append(r5)
            r5 = 10
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "hash:"
            r4.append(r6)
            int r6 = r9.hashCode()
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "displayName:"
            r4.append(r6)
            java.lang.String r6 = r2.mo137524x2()
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "username:"
            r4.append(r6)
            java.lang.String r6 = r2.getUserName()
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "sns_id:"
            r4.append(r6)
            java.lang.String r6 = r2.mo137504B2()
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "local_id:"
            r4.append(r6)
            java.lang.String r6 = r2.mo137503A2()
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r2.mo137509G2()
            r4 = 0
            if (r2 == 0) goto L_0x00cd
            te3.j00 r2 = r2.ContentObj
            if (r2 == 0) goto L_0x00cd
            java.util.LinkedList<te3.kv2> r2 = r2.f298427h
            goto L_0x00ce
        L_0x00cd:
            r2 = r4
        L_0x00ce:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r2 == 0) goto L_0x00f1
            java.util.Iterator r2 = r2.iterator()
        L_0x00d9:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00f1
            java.lang.Object r7 = r2.next()
            te3.kv2 r7 = (te3.C101804kv2) r7
            java.lang.String r7 = r7.f298689d
            r6.append(r7)
            java.lang.String r7 = "|"
            r6.append(r7)
            goto L_0x00d9
        L_0x00f1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "medis_list:\n"
            r2.append(r7)
            r2.append(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r5 = r9.mo137309b()
            r2.<init>(r5)
            r2.setText(r3)
            r5 = 19
            r2.setGravity(r5)
            r5 = 1095761920(0x41500000, float:13.0)
            r6 = 1
            r2.setTextSize(r6, r5)
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r7 = -1
            r8 = -2
            r5.<init>(r7, r8)
            r2.setLayoutParams(r5)
            android.content.Context r5 = r9.mo137309b()
            r7 = 2131099800(0x7f060098, float:1.7811963E38)
            int r5 = kg3.C76577a.m92153d(r5, r7)
            r2.setTextColor(r5)
            android.graphics.Typeface r5 = android.graphics.Typeface.MONOSPACE
            r2.setTypeface(r5)
            android.content.Context r5 = r9.mo137309b()
            r7 = 2131165553(0x7f070171, float:1.7945326E38)
            int r5 = kg3.C76577a.m92157h(r5, r7)
            r2.setPadding(r5, r5, r5, r5)
            android.content.Context r5 = r9.mo137309b()
            fu2.d$b r7 = fu2.C97998d.C97999b.f287403d
            qo3.g r2 = nj3.C76879j.m92745p(r5, r4, r2, r7)
            fu2.d$c r4 = new fu2.d$c
            r4.<init>(r9, r3)
            java.lang.String r3 = "复制"
            r2.mo107542x(r3, r6, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fu2.C97998d.mo137322n():void");
    }
}
