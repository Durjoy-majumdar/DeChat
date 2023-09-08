package com.tencent.p014mm.p136ui.chatting.view;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.view.C57702l;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.view.j */
public class C57700j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C57702l f165140d;

    public C57700j(C57702l lVar) {
        this.f165140d = lVar;
    }

    public void onClick(View view) {
        long j;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/view/MMRemindDatePicker$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C57702l lVar = this.f165140d;
        C57702l.C57703a aVar = lVar.f165149h;
        if (aVar != null) {
            lVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            int value = lVar.f165142a.getValue();
            int value2 = lVar.f165143b.getValue();
            if (value != 0) {
                currentTimeMillis = lVar.f165150i.get(value).longValue();
            } else if (CrashReportFactory.hasDebuger()) {
                j = 30000;
                long j2 = currentTimeMillis + j;
                Log.m105925i("MicroMsg.MMRemindDatePicker", "[getTimestamp] date:%s", C72715f.m85111d(lVar.f165146e.getString(C0966R.string.f360811ez2) + "HH:mm", j2 / 1000));
                aVar.mo82035a(j2);
            }
            j = ((long) (value2 + 1)) * 3600000;
            long j25 = currentTimeMillis + j;
            Log.m105925i("MicroMsg.MMRemindDatePicker", "[getTimestamp] date:%s", C72715f.m85111d(lVar.f165146e.getString(C0966R.string.f360811ez2) + "HH:mm", j25 / 1000));
            aVar.mo82035a(j25);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/view/MMRemindDatePicker$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
