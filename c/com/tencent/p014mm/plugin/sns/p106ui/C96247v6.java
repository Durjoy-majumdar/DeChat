package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import os2.C35299v;

/* renamed from: com.tencent.mm.plugin.sns.ui.v6 */
public class C96247v6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LayoutInflater f281240d;

    /* renamed from: e */
    public final /* synthetic */ TimeLineObject f281241e;

    /* renamed from: f */
    public final /* synthetic */ SnsInfo f281242f;

    /* renamed from: g */
    public final /* synthetic */ long f281243g;

    /* renamed from: h */
    public final /* synthetic */ SnsTimeLineUI f281244h;

    /* renamed from: com.tencent.mm.plugin.sns.ui.v6$a */
    public class C96248a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f281245d;

        public C96248a(String str) {
            this.f281245d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$74$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$74$1");
            Log.m105918d("MicroMsg.SnsTimeLineUI", "collapse tips click");
            Intent intent = new Intent(C96247v6.this.f281244h, SnsCommentDetailUI.class);
            intent.putExtra("INTENT_TALKER", C96247v6.this.f281242f.getUserName());
            intent.putExtra("INTENT_SNS_LOCAL_ID", C96247v6.this.f281242f.localid);
            intent.putExtra("INTENT_FROMGALLERY", false);
            intent.putExtra("intent_show_collapse_info", true);
            intent.putExtra("intent_content_collapse_hint", this.f281245d);
            SnsTimeLineUI snsTimeLineUI = C96247v6.this.f281244h;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SnsTimeLineUI snsTimeLineUI2 = snsTimeLineUI;
            C117292a.m165358d(snsTimeLineUI2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$74$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            snsTimeLineUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(snsTimeLineUI2, "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$74$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C35299v.m40633a(C96247v6.this.f281243g);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$74$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$74$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C96247v6(SnsTimeLineUI snsTimeLineUI, LayoutInflater layoutInflater, TimeLineObject timeLineObject, SnsInfo snsInfo, long j) {
        this.f281244h = snsTimeLineUI;
        this.f281240d = layoutInflater;
        this.f281241e = timeLineObject;
        this.f281242f = snsInfo;
        this.f281243g = j;
    }

    public void run() {
        String str;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$74");
        View inflate = this.f281240d.inflate(C0966R.C0971layout.c38, SnsTimeLineUI.m122297Y7(this.f281244h), false);
        SnsTimeLineUI.m122297Y7(this.f281244h).addView(inflate);
        if (SnsTimeLineUI.m122297Y7(this.f281244h).getChildCount() > 0) {
            SnsTimeLineUI.m122297Y7(this.f281244h).setVisibility(0);
        }
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.juz);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f359262jv0);
        if (textView == null) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$74");
            return;
        }
        if (this.f281241e.ContentObj.f298427h.size() > 0) {
            C94901o Fx0 = C94866e1.Fx0();
            int hashCode = this.f281244h.hashCode();
            C96983o3 c = C96983o3.m124651c();
            c.f284145b = this.f281241e.CreateTime;
            Fx0.mo131105Y(this.f281241e.ContentObj.f298427h.get(0), imageView, hashCode, c);
        }
        int i = this.f281241e.ContentObj.f298424e;
        if (i == 1) {
            textView.setText(C0966R.string.jfu);
            str = this.f281244h.getString(C0966R.string.jfv);
        } else if (i == 15) {
            textView.setText(C0966R.string.jhc);
            str = this.f281244h.getString(C0966R.string.jhd);
        } else {
            str = "";
        }
        inflate.setOnClickListener(new C96248a(str));
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$74");
    }
}
