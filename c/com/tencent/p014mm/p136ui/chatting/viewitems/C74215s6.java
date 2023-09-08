package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C67391b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetStaticMapEvent;
import com.tencent.p014mm.autogen.events.LocationServerEvent;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lg3.C76695c;
import p158gt.C98201k;
import uj3.C78208e;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.s6 */
public class C74215s6 extends C74023i.C74026c {

    /* renamed from: b */
    public LinearLayout f217869b;

    /* renamed from: c */
    public TextView f217870c;

    /* renamed from: d */
    public TextView f217871d;

    /* renamed from: e */
    public ProgressBar f217872e;

    /* renamed from: f */
    public ImageView f217873f;

    /* renamed from: g */
    public ProgressBar f217874g;

    /* renamed from: h */
    public ImageView f217875h;

    /* renamed from: i */
    public ImageView f217876i;

    /* renamed from: b */
    public static boolean m88452b(String str, C67391b bVar) {
        return str != null && !str.equals("") && !str.equals(bVar.mo91572m().getString(C0966R.string.gbf));
    }

    /* renamed from: c */
    public static void m88453c(C74023i iVar, C74215s6 s6Var, C72963f4 f4Var, boolean z, C78208e eVar, C67391b bVar, String str, C74196r6 r6Var, View.OnLongClickListener onLongClickListener) {
        if (s6Var != null) {
            s6Var.f217869b.setVisibility(8);
            int b = C76577a.m92151b(bVar.mo91565f(), 236);
            int b2 = C76577a.m92151b(bVar.mo91565f(), 90);
            s6Var.f217870c.setMaxLines(1);
            s6Var.f217871d.setMaxLines(1);
            s6Var.f217871d.setText("");
            C88144b.m109788f(FirebaseAnalytics.C113379b.LOCATION);
            Log.m105918d("MicroMsg.LocationItemHolder", "plugin found!");
            LocationServerEvent locationServerEvent = new LocationServerEvent();
            LocationServerEvent.C67729a aVar = locationServerEvent.f193728d;
            aVar.f193730a = 1;
            aVar.f193733d = f4Var;
            locationServerEvent.publish();
            LocationServerEvent.C67730b bVar2 = locationServerEvent.f193729e;
            String str2 = bVar2.f193734a;
            String str3 = bVar2.f193735b;
            if ((str2 != null || m88452b(str3, bVar)) && ((str2 == null || !str2.equals("") || m88452b(str3, bVar)) && (str2 == null || !str2.equals("err_not_started")))) {
                s6Var.f217874g.setVisibility(8);
                s6Var.f217869b.setVisibility(0);
                Log.m105918d("MicroMsg.LocationItemHolder", "location info : " + str2);
                if (m88452b(str3, bVar)) {
                    s6Var.f217870c.setVisibility(0);
                    s6Var.f217870c.setText(str3);
                    if (str2 == null || str2.equals("")) {
                        s6Var.f217871d.setVisibility(8);
                    } else {
                        s6Var.f217871d.setVisibility(0);
                        s6Var.f217871d.setText(str2);
                    }
                } else {
                    s6Var.f217870c.setMaxLines(2);
                    TextView textView = s6Var.f217870c;
                    textView.setText("" + str2);
                    s6Var.f217871d.setVisibility(8);
                }
            } else {
                Log.m105918d("MicroMsg.LocationItemHolder", "info error or subcore not started!");
                s6Var.f217874g.setVisibility(8);
                s6Var.f217869b.setVisibility(0);
                s6Var.f217870c.setText(C0966R.string.gaw);
                s6Var.f217871d.setText("");
            }
            s6Var.f217873f.setImageBitmap(((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).P50(C0966R.C0969drawable.bha, C0966R.C0969drawable.c8i, b, b2, z));
            GetStaticMapEvent getStaticMapEvent = new GetStaticMapEvent();
            GetStaticMapEvent.C67715a aVar2 = getStaticMapEvent.f193661d;
            aVar2.f193663a = f4Var;
            aVar2.f193668f = b;
            aVar2.f193669g = b2;
            aVar2.f193667e = C0966R.C0969drawable.c8i;
            aVar2.f193664b = s6Var.f217873f;
            aVar2.f193666d = s6Var.f217872e;
            aVar2.f193665c = s6Var.f217875h;
            getStaticMapEvent.publish();
            s6Var.clickArea.setTag(new C74243t8(f4Var, bVar.mo91583x(), s6Var, (String) null));
            s6Var.clickArea.setOnClickListener(r6Var);
            s6Var.clickArea.setOnLongClickListener(onLongClickListener);
            s6Var.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
        }
    }

    /* renamed from: a */
    public C74023i.C74026c mo103237a(View view, boolean z) {
        super.create(view);
        this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
        this.f217871d = (TextView) view.findViewById(C0966R.C0970id.b7c);
        this.f217870c = (TextView) view.findViewById(C0966R.C0970id.b7e);
        this.f217869b = (LinearLayout) view.findViewById(C0966R.C0970id.b7d);
        this.f217872e = (ProgressBar) view.findViewById(C0966R.C0970id.b7_);
        this.clickArea = view.findViewById(C0966R.C0970id.b47);
        this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        this.f217873f = (ImageView) view.findViewById(C0966R.C0970id.b7b);
        this.f217874g = (ProgressBar) view.findViewById(C0966R.C0970id.b7a);
        this.f217875h = (ImageView) view.findViewById(C0966R.C0970id.b4f);
        if (C76695c.m92341b()) {
            this.f217875h.setImageResource(C0966R.C0969drawable.c56);
        }
        if (!z) {
            this.stateIV = (ImageView) view.findViewById(C0966R.C0970id.b8v);
            this.f217876i = (ImageView) view.findViewById(C0966R.C0970id.b8x);
        }
        this.f217870c.setTextSize(1, 16.0f);
        this.f217871d.setTextSize(1, 12.0f);
        int i = C85875k4.m106211z() ? 0 : 8;
        View findViewById = view.findViewById(C0966R.C0970id.gob);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemLocation$LocationItemHolder", "createHolder", "(Landroid/view/View;Z)Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemLocation$LocationItemHolder", "createHolder", "(Landroid/view/View;Z)Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return this;
    }
}
