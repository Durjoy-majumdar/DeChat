package mj3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import f40.C86709a0;
import gb0.C75896b;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import zt3.C119157j;

/* renamed from: mj3.a */
public class C76768a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C76772b f224562d;

    /* renamed from: mj3.a$a */
    public class C76769a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f224563d;

        /* renamed from: mj3.a$a$a */
        public class C76770a implements View.OnClickListener {
            public C76770a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/banner/ChattingMonitoredBanner$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C76772b.m92510h(C76768a.this.f224562d, 1);
                C76772b bVar = C76768a.this.f224562d;
                String str = bVar.f224568i;
                bVar.getClass();
                if (Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.ChattingMonitoredBanner", "hy: not provide url");
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str);
                    intent.putExtra("showShare", false);
                    intent.putExtra("show_bottom", false);
                    C88144b.m109791i(bVar.f230570g.get(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/banner/ChattingMonitoredBanner$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: mj3.a$a$b */
        public class C76771b implements View.OnClickListener {
            public C76771b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/banner/ChattingMonitoredBanner$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.ChattingMonitoredBanner", "hy: user required close the banner");
                C76772b.m92510h(C76768a.this.f224562d, 2);
                C97625j3.m125812b().mo105903r().mo106164c(C75896b.C75898b.Main);
                C97625j3.m125812b().mo105903r().mo106164c(C75896b.C75898b.Chatting);
                C76768a.this.f224562d.mo7975g(8);
                C117292a.m165361g(this, "com/tencent/mm/ui/banner/ChattingMonitoredBanner$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C76769a(boolean z) {
            this.f224563d = z;
        }

        public void run() {
            if (this.f224563d) {
                C76772b bVar = C76768a.this.f224562d;
                Log.m105925i("MicroMsg.ChattingMonitoredBanner", "hy: start show banner: %s, %s, %s, %b", bVar.f224570n, bVar.f224567h, bVar.f224568i, Boolean.valueOf(bVar.f224569j));
                C76772b bVar2 = C76768a.this.f224562d;
                if (bVar2.f224570n == C75896b.C75898b.Chatting) {
                    C97625j3.m125812b().mo105903r().getClass();
                    bVar2.f224567h = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_WORDING_STRING_SYNC, "");
                    C76772b bVar3 = C76768a.this.f224562d;
                    C97625j3.m125812b().mo105903r().getClass();
                    bVar3.f224568i = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_URL_STRING_SYNC, "");
                    C76772b bVar4 = C76768a.this.f224562d;
                    C97625j3.m125812b().mo105903r().getClass();
                    bVar4.f224569j = ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_CLOSABLE_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue();
                } else {
                    C97625j3.m125812b().mo105903r().getClass();
                    bVar2.f224567h = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_MAIN_MONITOR_MAIN_WORDING_STRING_SYNC, "");
                    C76772b bVar5 = C76768a.this.f224562d;
                    C97625j3.m125812b().mo105903r().getClass();
                    bVar5.f224568i = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_MAIN_MONITOR_MAIN_URL_STRING_SYNC, "");
                    C76772b bVar6 = C76768a.this.f224562d;
                    C97625j3.m125812b().mo105903r().getClass();
                    bVar6.f224569j = ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_MAIN_MONITOR_MAIN_CLOSABLE_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue();
                }
                TextView textView = (TextView) C76768a.this.f224562d.f230569f.findViewById(C0966R.C0970id.b7n);
                ImageView imageView = (ImageView) C76768a.this.f224562d.f230569f.findViewById(C0966R.C0970id.bem);
                if (!Util.isNullOrNil(C76768a.this.f224562d.f224567h)) {
                    textView.setText(C76768a.this.f224562d.f224567h);
                } else {
                    textView.setText(C0966R.string.a4d);
                }
                textView.setSelected(true);
                if (!Util.isNullOrNil(C76768a.this.f224562d.f224568i)) {
                    C76768a.this.f224562d.f230569f.findViewById(C0966R.C0970id.gys).setBackgroundResource(C0966R.C0969drawable.axp);
                    imageView.setImageResource(C0966R.C0969drawable.aha);
                    textView.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_50));
                } else {
                    C76768a.this.f224562d.f230569f.findViewById(C0966R.C0970id.gys).setBackgroundResource(C0966R.color.agt);
                    imageView.setImageResource(C0966R.C0969drawable.ah_);
                    textView.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.al_));
                }
                C76768a.this.f224562d.f230569f.setOnClickListener(new C76770a());
                if (C76768a.this.f224562d.f230569f.getVisibility() != 0) {
                    C76772b bVar7 = C76768a.this.f224562d;
                    bVar7.f224571o = "" + C86709a0.m107523b().mo121110g() + "_" + System.currentTimeMillis();
                    C76772b.m92510h(C76768a.this.f224562d, 0);
                }
                C76768a.this.f224562d.mo7975g(0);
                if (C76768a.this.f224562d.f224569j) {
                    imageView.setVisibility(0);
                    imageView.setOnClickListener(new C76771b());
                    return;
                }
                imageView.setVisibility(8);
                return;
            }
            Log.m105924i("MicroMsg.ChattingMonitoredBanner", "hy: should not show banner");
            C76768a.this.f224562d.mo7975g(8);
        }
    }

    public C76768a(C76772b bVar) {
        this.f224562d = bVar;
    }

    public void run() {
        boolean d = C97625j3.m125812b().mo105903r().mo106165d(this.f224562d.f224570n);
        ((C119157j) C119157j.f356862d).mo183895z(new C76769a(d));
    }
}
