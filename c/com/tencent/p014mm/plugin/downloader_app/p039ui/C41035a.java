package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.view.View;
import c51.C39896e;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader_app.model.C40983c;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.model.C40994i;
import com.tencent.p014mm.plugin.downloader_app.model.C40995j;
import com.tencent.p014mm.plugin.downloader_app.model.C40996k;
import com.tencent.p014mm.plugin.downloader_app.model.C40998l;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskItemView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86312j;
import e51.C45542a;
import e51.C45543b;
import e51.C45545g;
import g51.C45880a;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import p237sp.C13754y;
import v10.C52735e;
import y41.C53491a;
import y41.C53493b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.a */
public class C41035a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TaskItemView f110496d;

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.a$a */
    public class C41036a implements C45543b {
        public C41036a() {
        }

        /* renamed from: a */
        public void mo63984a(C45542a aVar, long j) {
            if (aVar != C45542a.WAIT_FOR_WIFI) {
                TaskItemView taskItemView = C41035a.this.f110496d;
                int i = TaskItemView.f110453D;
                taskItemView.mo64068b();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.a$b */
    public class C41037b implements C45543b {
        public C41037b() {
        }

        /* renamed from: a */
        public void mo63984a(C45542a aVar, long j) {
            if (aVar == C45542a.WAIT_FOR_WIFI) {
                TaskItemView taskItemView = C41035a.this.f110496d;
                int i = TaskItemView.f110453D;
                taskItemView.mo64068b();
            }
        }
    }

    public C41035a(TaskItemView taskItemView) {
        this.f110496d = taskItemView;
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        View view2 = view;
        Class cls = C45545g.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TaskItemView.C41028a aVar = this.f110496d.f110456C;
        if (aVar == null || !((DownloadMainUI.C41023d) aVar).mo64061a(view2, 1)) {
            C53736a d = C40933j.m44315d(this.f110496d.f110454A.f110335f);
            if (d.field_status == 1) {
                Context context = this.f110496d.getContext();
                C40990e0 e0Var = this.f110496d.f110454A;
                C53736a d2 = C40933j.m44315d(e0Var.f110335f);
                if (d2 != null) {
                    ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63965m(d2.field_downloadId);
                    C45880a.m51163b(10, C45880a.m51162a(e0Var.f110332c), e0Var.f110333d, 5, d2.field_appId, "", "");
                    if (((C52735e) C86312j.m106911c(C52735e.class)).mo61269fe(C32735h.C32737c.clicfg_download_game_ignore_network, false) && !NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                        ((C45545g) C86312j.m106911c(cls)).nk0(context, d2.field_appId, new C40994i(e0Var), new C40995j(e0Var));
                    }
                }
                C39896e.m42675c(this.f110496d.getContext(), this.f110496d.f110454A.f110335f);
                str2 = "(Landroid/view/View;)V";
                str = "onClick";
            } else {
                TaskItemView taskItemView = this.f110496d;
                if (taskItemView.f110463j.f158316i) {
                    Context context2 = taskItemView.getContext();
                    long j = d.field_downloadId;
                    C41036a aVar2 = new C41036a();
                    C53736a c = C40933j.m44314c(j);
                    if (c == null) {
                        aVar2.mo63984a(C45542a.FAIL, -1);
                        str4 = "(Landroid/view/View;)V";
                        str3 = "onClick";
                    } else {
                        str4 = "(Landroid/view/View;)V";
                        str3 = "onClick";
                        C53491a.m60013c(12, new C53493b(c.field_appId, c.field_scene, c.field_downloadId, "", (String) null, 1));
                        ((C45545g) C86312j.m106911c(cls)).mo71049gM(context2, c.field_appId, new C40996k(c, context2, aVar2), new C40998l(c, context2, aVar2, j), (C45545g.C45546a) null);
                    }
                } else {
                    str4 = "(Landroid/view/View;)V";
                    str3 = "onClick";
                    C40983c.m44423e(taskItemView.getContext(), this.f110496d.f110454A, true, new C41037b());
                }
                str2 = str4;
                str = str3;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$1", "android/view/View$OnClickListener", str, str2);
            return;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
