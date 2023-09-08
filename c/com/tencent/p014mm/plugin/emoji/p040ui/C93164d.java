package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import l60.C99342a;
import sh3.C101619a;
import sh3.C101631k;
import te3.C101814mn2;
import v61.C37682c;
import vh3.C102191c;

/* renamed from: com.tencent.mm.plugin.emoji.ui.d */
public class C93164d implements C102191c {

    /* renamed from: a */
    public final /* synthetic */ CustomSmileyPreviewUI f268684a;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.d$a */
    public class C93165a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101814mn2 f268685d;

        /* renamed from: com.tencent.mm.plugin.emoji.ui.d$a$a */
        public class C93166a implements View.OnClickListener {
            public C93166a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$10$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                CustomSmileyPreviewUI customSmileyPreviewUI = C93164d.this.f268684a;
                C37682c.m41479b(customSmileyPreviewUI, 6, customSmileyPreviewUI.f268364z.getMd5(), C93164d.this.f268684a.f268361x0);
                C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$10$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C93165a(C101814mn2 mn22) {
            this.f268685d = mn22;
        }

        public void run() {
            if (this.f268685d != null) {
                C93164d.this.f268684a.f268315I.setVisibility(0);
                C60979d<C101619a> dVar = C101631k.f297497a;
                ((C99342a) C101631k.f297497a.mo85955a(new C101619a(this.f268685d))).mo85954d(C93164d.this.f268684a.f268316J);
                C93164d.this.f268684a.f268317K.setText(this.f268685d.f298864f);
                if (!Util.isNullOrNil(this.f268685d.f298865g.f136020e)) {
                    View view = C93164d.this.f268684a.f268319M;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$10$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$10$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C93164d.this.f268684a.f268320N.setVisibility(8);
                    C93164d.this.f268684a.f268318L.setText(this.f268685d.f298865g.f136020e);
                } else {
                    View view3 = C93164d.this.f268684a.f268319M;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$10$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$10$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C93164d.this.f268684a.f268321P.setOnClickListener(new C93166a());
            }
        }
    }

    public C93164d(CustomSmileyPreviewUI customSmileyPreviewUI) {
        this.f268684a = customSmileyPreviewUI;
    }

    /* renamed from: a */
    public void mo125818a(int i, C101814mn2 mn22) {
        Object[] objArr = new Object[1];
        objArr[0] = mn22 == null ? "" : mn22.f298862d;
        Log.m105925i("MicroMsg.emoji.CustomSmileyPreviewUI", "onResult: %s", objArr);
        this.f268684a.runOnUiThread(new C93165a(mn22));
    }
}
