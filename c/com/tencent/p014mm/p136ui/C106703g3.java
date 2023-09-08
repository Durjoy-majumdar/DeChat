package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105844v0;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.g3 */
public final class C106703g3 {

    /* renamed from: a */
    public Context f319007a;

    /* renamed from: b */
    public String f319008b;

    /* renamed from: c */
    public final int f319009c;

    /* renamed from: d */
    public C32224a<C13598b0> f319010d;

    /* renamed from: e */
    public View f319011e;

    /* renamed from: f */
    public TextView f319012f;

    /* renamed from: g */
    public View f319013g;

    /* renamed from: h */
    public int f319014h;

    /* renamed from: i */
    public RelativeLayout f319015i;

    /* renamed from: j */
    public int f319016j;

    /* renamed from: k */
    public Toast f319017k;

    /* renamed from: l */
    public C89779i0 f319018l;

    /* renamed from: m */
    public final C0120a0<C105844v0> f319019m;

    /* renamed from: com.tencent.mm.ui.g3$a */
    public static final class C106704a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C106703g3 f319020d;

        /* renamed from: e */
        public final /* synthetic */ Context f319021e;

        public C106704a(C106703g3 g3Var, Context context) {
            this.f319020d = g3Var;
            this.f319021e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/ScreenProfileReadyPluginUI$applyClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i = this.f319020d.f319009c;
            if (i == 3) {
                C105851w0.zx0().f314475Q0.removeObserver(this.f319020d.f319019m);
                C54219z zVar = C105851w0.zx0().f314475Q0;
                Context context = this.f319021e;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                zVar.observe((MMActivity) context, this.f319020d.f319019m);
            } else if (i == 4) {
                Intent intent = new Intent();
                intent.putExtra(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f319020d.f319008b);
                Context context2 = this.f319021e;
                C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context2).setResult(-1, intent);
                Context context3 = this.f319021e;
                C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context3).finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/ScreenProfileReadyPluginUI$applyClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C106703g3(Context context, String str, int i, C32224a<C13598b0> aVar, int i2, C8480h hVar) {
        i = (i2 & 4) != 0 ? 3 : i;
        aVar = (i2 & 8) != 0 ? null : aVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        this.f319007a = context;
        this.f319008b = str;
        this.f319009c = i;
        this.f319010d = aVar;
        this.f319019m = new C106710h3(this);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo153676a(android.content.Context r13) {
        /*
            r12 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r13, r0)
            android.view.View r0 = r12.f319011e
            if (r0 == 0) goto L_0x0012
            r1 = 2131312807(0x7f0940a7, float:1.8243993E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
        L_0x0012:
            android.view.View r0 = r12.f319011e
            r1 = 0
            if (r0 == 0) goto L_0x0021
            r2 = 2131312808(0x7f0940a8, float:1.8243995E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0022
        L_0x0021:
            r0 = r1
        L_0x0022:
            r12.f319012f = r0
            r2 = 4
            if (r0 != 0) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            r0.setVisibility(r2)
        L_0x002b:
            android.view.View r0 = r12.f319011e
            if (r0 == 0) goto L_0x0037
            r3 = 2131312809(0x7f0940a9, float:1.8243997E38)
            android.view.View r0 = r0.findViewById(r3)
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            r12.f319013g = r0
            if (r0 != 0) goto L_0x003d
            goto L_0x007d
        L_0x003d:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/ui/ScreenProfileReadyPluginUI"
            java.lang.String r6 = "applyClickEvent"
            java.lang.String r7 = "(Landroid/content/Context;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = 0
            java.lang.Object r3 = r11.mo10231a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r4 = "com/tencent/mm/ui/ScreenProfileReadyPluginUI"
            java.lang.String r5 = "applyClickEvent"
            java.lang.String r6 = "(Landroid/content/Context;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r0
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x007d:
            android.view.View r0 = r12.f319011e
            if (r0 == 0) goto L_0x008b
            r1 = 2131312811(0x7f0940ab, float:1.8244001E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
        L_0x008b:
            r12.f319015i = r1
            if (r1 != 0) goto L_0x0090
            goto L_0x0093
        L_0x0090:
            r1.setVisibility(r2)
        L_0x0093:
            android.widget.RelativeLayout r0 = r12.f319015i
            if (r0 == 0) goto L_0x009f
            com.tencent.mm.ui.g3$a r1 = new com.tencent.mm.ui.g3$a
            r1.<init>(r12, r13)
            r0.setOnClickListener(r1)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C106703g3.mo153676a(android.content.Context):void");
    }

    /* renamed from: b */
    public final void mo153677b() {
        RelativeLayout relativeLayout = this.f319015i;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        View view = this.f319011e;
        View findViewById = view != null ? view.findViewById(C0966R.C0970id.f359127j34) : null;
        this.f319013g = findViewById;
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "refreshIndexLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "refreshIndexLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView = this.f319012f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f319012f;
        if (textView2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f319014h + 1);
            sb.append(XVFSFile.SEPARATOR_CHAR);
            sb.append(this.f319016j);
            textView2.setText(sb.toString());
        }
    }
}
