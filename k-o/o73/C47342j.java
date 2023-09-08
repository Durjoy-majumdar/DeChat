package o73;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.plugin.wear.model.C43462g;
import com.tencent.p014mm.plugin.wear.model.C43464h;
import com.tencent.p014mm.plugin.wear.model.C43465i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatLocaleUtil;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import l73.C46836a;
import pe3.C89349b;
import te3.e15;

/* renamed from: o73.j */
public class C47342j extends C47334b {

    /* renamed from: d */
    public String f127036d;

    /* renamed from: e */
    public int f127037e;

    /* renamed from: f */
    public boolean f127038f;

    public C47342j(String str, int i, boolean z, boolean z2) {
        this.f127036d = str;
        this.f127037e = i;
        this.f127038f = z2;
    }

    /* renamed from: b */
    public String mo67621b() {
        return "WearNotificationCreateTask";
    }

    /* renamed from: c */
    public void mo67622c() {
        String str;
        Log.m105918d("MicroMsg.WearNotificationCreateTask", "start to execute notification create task");
        C43462g a = C43457b.yx0().mo67628a(this.f127036d);
        ArrayList arrayList = new ArrayList();
        int i = this.f127037e - a.f117479d;
        if (i < 0) {
            i = 0;
        }
        Log.m105919d("MicroMsg.WearNotificationCreateTask", "limit=%d", Integer.valueOf(i));
        Iterator it = ((ArrayList) ((C72972g4) C97625j3.m125812b().mo105911z()).Lx0(this.f127036d, i)).iterator();
        while (it.hasNext()) {
            C72963f4 f4Var = (C72963f4) it.next();
            if (!f4Var.mo100990c4()) {
                arrayList.add(f4Var);
            }
        }
        Log.m105925i("MicroMsg.WearNotificationCreateTask", "receiveUnreadMsgList.size=%d", Integer.valueOf(arrayList.size()));
        if (arrayList.size() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C72963f4 f4Var2 = (C72963f4) it4.next();
                stringBuffer.append(f4Var2.getMsgId());
                stringBuffer.append(f4Var2.mo108768t());
                stringBuffer.append(f4Var2.getContent());
                stringBuffer.append(f4Var2.getType());
                stringBuffer.append(f4Var2.getCreateTime());
            }
            String mD5String = MD5Util.getMD5String(stringBuffer.toString());
            if (a.f117478c.equals(mD5String)) {
                Log.m105924i("MicroMsg.WearNotificationCreateTask", "same md5, not to update");
                return;
            }
            a.f117478c = mD5String;
            e15 e15 = new e15();
            e15.f132625d = a.f117477b;
            String str2 = a.f117476a;
            e15.f132626e = str2;
            e15.f132627f = C43465i.m46972b(str2);
            String str3 = a.f117476a;
            Log.m105919d("MicroMsg.WearNotificationCreateTask", "Talker: %s, MsgSize: %d", str3, Integer.valueOf(arrayList.size()));
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C72963f4 f4Var3 = (C72963f4) arrayList.get(size);
                if (C72996z1.m85820U5(str3)) {
                    str = String.format(MMApplicationContext.getContext().getString(C0966R.string.hbh), new Object[]{C43465i.m46972b(mo72382d(str3, f4Var3)), 8203, C43465i.m46975e(f4Var3).f130223f});
                } else {
                    str = String.format(MMApplicationContext.getContext().getString(C0966R.string.hbi), new Object[]{C43465i.m46975e(f4Var3).f130223f});
                }
                stringBuffer2.append(str);
                stringBuffer2.append("​​");
            }
            e15.f132628g = stringBuffer2.toString().trim();
            e15.f132629h = this.f127037e;
            e15.f132632n = this.f127038f;
            e15.f132631j = !WeChatLocaleUtil.isOverseasUserByWechatLanguage();
            Bitmap c = C43465i.m46973c(a.f117476a);
            if (c != null) {
                e15.f132630i = new C89349b(C43465i.m46971a(c));
            }
            Log.m105918d("MicroMsg.WearNotificationCreateTask", "generate notification content and ready to send");
            try {
                C43457b.zx0().mo72270b(20003, e15.toByteArray(), true);
            } catch (IOException unused) {
            }
            Log.m105918d("MicroMsg.WearNotificationCreateTask", "start to update notification status");
            C43464h yx02 = C43457b.yx0();
            synchronized (yx02) {
                Log.m105925i("MicroMsg.Wear.WearNotificationMap", "update notification=%s", a);
                yx02.f117487a.put(a.f117476a, a);
            }
            C43464h yx03 = C43457b.yx0();
            String str4 = this.f127036d;
            synchronized (yx03) {
                if (yx03.f117487a.containsKey(str4)) {
                    C43462g gVar = yx03.f117487a.get(str4);
                    gVar.f117480e = C43462g.C43463a.SHOWING;
                    Log.m105925i("MicroMsg.Wear.WearNotificationMap", "Update showing success, notification=%s", gVar);
                }
            }
            C46836a.m52129b(6, 0);
            C46836a.m52128a(1);
        }
    }
}
