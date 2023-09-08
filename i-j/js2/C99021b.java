package js2;

import android.view.View;
import android.view.ViewStub;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.autogen.events.NotifyTimelineFpEvent;
import com.tencent.p014mm.plugin.sns.model.C94893m;
import com.tencent.p014mm.plugin.sns.p106ui.C96071m8;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: js2.b */
public class C99021b implements C94893m, C11385n {

    /* renamed from: d */
    public Map<Long, Integer> f290298d = new HashMap();

    /* renamed from: e */
    public HashSet<Long> f290299e = new HashSet<>();

    /* renamed from: f */
    public HashMap<Long, C33658a> f290300f;

    /* renamed from: js2.b$a */
    public static class C33658a {

        /* renamed from: a */
        public long f91072a;

        /* renamed from: b */
        public String f91073b;

        /* renamed from: c */
        public String f91074c;

        /* renamed from: a */
        public void mo59246a(int i, int i2, int i3, int i4) {
            SnsMethodCalculate.markStartTimeMs("addAction", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr$KvStat");
            if (i == -1 || i2 == -1) {
                SnsMethodCalculate.markEndTimeMs("addAction", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr$KvStat");
                return;
            }
            String str = i + XVFSFile.PATH_SEPARATOR + i2 + XVFSFile.PATH_SEPARATOR + i3 + XVFSFile.PATH_SEPARATOR + i4;
            String str2 = i + XVFSFile.PATH_SEPARATOR + i2;
            if (str.equals(this.f91073b) || (this.f91073b.startsWith(str2) && i3 == 0 && i4 == 0)) {
                SnsMethodCalculate.markEndTimeMs("addAction", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr$KvStat");
                return;
            }
            SnsMethodCalculate.markStartTimeMs("addPreClickAction", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr$KvStat");
            this.f91073b = str;
            SnsMethodCalculate.markEndTimeMs("addPreClickAction", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr$KvStat");
            String str3 = i + XVFSFile.PATH_SEPARATOR + i2 + XVFSFile.PATH_SEPARATOR + i3 + XVFSFile.PATH_SEPARATOR + i4;
            SnsMethodCalculate.markStartTimeMs("addAction", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr$KvStat");
            if (!Util.isNullOrNil(this.f91074c)) {
                this.f91074c += "|";
            }
            this.f91074c += str3;
            SnsMethodCalculate.markEndTimeMs("addAction", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr$KvStat");
            SnsMethodCalculate.markEndTimeMs("addAction", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr$KvStat");
        }
    }

    static {
        Pattern.compile("\\{richtext:([\\s\\S]*?)\\}");
        Pattern.compile("\\{sex:([\\s\\S]*?):([\\s\\S]*?):([\\s\\S]*?)\\}");
    }

    public C99021b() {
        new HashSet();
        this.f290300f = new HashMap<>();
    }

    /* renamed from: a */
    public void mo131073a(int i, String str, long j, TimeLineObject timeLineObject, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onItemRemove", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        if (this.f290300f.containsKey(Long.valueOf(j))) {
            C33658a aVar = this.f290300f.get(Long.valueOf(j));
            if (aVar.f91072a == -1) {
                aVar.f91072a = System.currentTimeMillis();
            }
            aVar.getClass();
            aVar.getClass();
            aVar.mo59246a(0, 0, 0, 0);
        }
        SnsMethodCalculate.markEndTimeMs("onItemRemove", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }

    /* renamed from: b */
    public void mo131074b(int i, String str, long j, TimeLineObject timeLineObject, boolean z, C96071m8 m8Var) {
        SnsMethodCalculate.markStartTimeMs("onItemAdd", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        SnsMethodCalculate.markEndTimeMs("onItemAdd", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }

    /* renamed from: c */
    public final void mo138365c(BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("dismissAbTestView", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        if (baseViewHolder == null) {
            SnsMethodCalculate.markEndTimeMs("dismissAbTestView", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
            return;
        }
        ViewStub viewStub = baseViewHolder.f279943Z;
        if (viewStub != null) {
            viewStub.setVisibility(8);
        }
        ViewStub viewStub2 = baseViewHolder.f279945a0;
        if (viewStub2 != null) {
            viewStub2.setVisibility(8);
        }
        if (baseViewHolder.f279959h0.getVisibility() == 8) {
            View view = baseViewHolder.f279959h0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/newabtest/SnSABTestMgr", "dismissAbTestView", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/newabtest/SnSABTestMgr", "dismissAbTestView", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (baseViewHolder.f279962j.getVisibility() == 8) {
            baseViewHolder.f279962j.setVisibility(0);
        }
        if (baseViewHolder.f279960i.getVisibility() == 8) {
            View view2 = baseViewHolder.f279960i;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/newabtest/SnSABTestMgr", "dismissAbTestView", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/newabtest/SnSABTestMgr", "dismissAbTestView", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("dismissAbTestView", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }

    /* renamed from: d */
    public void mo138366d() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        ((HashMap) this.f290298d).clear();
        this.f290299e.clear();
        this.f290300f.clear();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        Log.m105924i("MicroMsg.SnSABTestMgr", "onSceneend " + i + " errCode " + i2);
        new NotifyTimelineFpEvent().publish();
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }
}
