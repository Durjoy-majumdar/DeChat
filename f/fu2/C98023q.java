package fu2;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C95787g0;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import gy3.C87412m;
import ke3.C88144b;

/* renamed from: fu2.q */
public final class C98023q extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ C98024r f287435d;

    public C98023q(C98024r rVar) {
        this.f287435d = rVar;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
        C87412m.m108594g(contextMenu, "menu");
        C87412m.m108594g(view, "v");
        Object tag = view.getTag();
        if (tag instanceof C95787g0) {
            C95787g0 g0Var = (C95787g0) tag;
            TimeLineObject timeLineObject = g0Var.f279450a;
            C88144b.m109788f("favorite");
            int i = timeLineObject.ContentObj.f298424e;
            if (i == 1) {
                contextMenu.add(0, 2, 0, view.getContext().getString(C0966R.string.f361137hk2));
            } else if (i == 9) {
                contextMenu.add(0, 5, 0, view.getContext().getString(C0966R.string.f361137hk2));
            } else if (i == 26) {
                contextMenu.add(0, 22, 0, view.getContext().getString(C0966R.string.f361137hk2));
            } else if (i == 33) {
                contextMenu.add(0, 24, 0, view.getContext().getString(C0966R.string.f361137hk2));
            } else if (i == 42) {
                contextMenu.add(0, 28, 0, view.getContext().getString(C0966R.string.f361137hk2));
                ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
                exDeviceHaveBindNetworkDeviceEvent.f236178d.f236181b = g0Var.f279451b;
                exDeviceHaveBindNetworkDeviceEvent.publish();
                if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                    contextMenu.add(0, 18, 0, view.getContext().getString(C0966R.string.a19));
                }
            } else if (i == 3) {
                contextMenu.add(0, 3, 0, view.getContext().getString(C0966R.string.f361137hk2));
                ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent2 = new ExDeviceHaveBindNetworkDeviceEvent();
                exDeviceHaveBindNetworkDeviceEvent2.f236178d.f236181b = g0Var.f279451b;
                exDeviceHaveBindNetworkDeviceEvent2.publish();
                if (exDeviceHaveBindNetworkDeviceEvent2.f236179e.f236182a) {
                    contextMenu.add(0, 18, 0, view.getContext().getString(C0966R.string.a19));
                }
            } else if (i == 4) {
                contextMenu.add(0, 4, 0, view.getContext().getString(C0966R.string.f361137hk2));
                ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent3 = new ExDeviceHaveBindNetworkDeviceEvent();
                exDeviceHaveBindNetworkDeviceEvent3.f236178d.f236181b = g0Var.f279451b;
                exDeviceHaveBindNetworkDeviceEvent3.publish();
                if (exDeviceHaveBindNetworkDeviceEvent3.f236179e.f236182a) {
                    contextMenu.add(0, 18, 0, view.getContext().getString(C0966R.string.a19));
                }
            } else if (i == 5) {
                contextMenu.add(0, 4, 0, view.getContext().getString(C0966R.string.f361137hk2));
                ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent4 = new ExDeviceHaveBindNetworkDeviceEvent();
                exDeviceHaveBindNetworkDeviceEvent4.f236178d.f236181b = g0Var.f279451b;
                exDeviceHaveBindNetworkDeviceEvent4.publish();
                if (exDeviceHaveBindNetworkDeviceEvent4.f236179e.f236182a) {
                    contextMenu.add(0, 18, 0, view.getContext().getString(C0966R.string.a19));
                }
            } else if (i == 14) {
                contextMenu.add(0, 9, 0, view.getContext().getString(C0966R.string.f361137hk2));
            } else if (i == 15) {
                contextMenu.add(0, 10, 0, view.getContext().getString(C0966R.string.f361137hk2));
            } else if (i != 29) {
                if (i == 30) {
                    contextMenu.add(0, 23, 0, view.getContext().getString(C0966R.string.f361137hk2));
                } else if (!(i == 37 || i == 38)) {
                    contextMenu.add(0, 3, 0, view.getContext().getString(C0966R.string.f361137hk2));
                }
            }
            NotInteresetABTestManager.m119627b(contextMenu, C94866e1.Yx0().mo139798DN(g0Var.f279451b));
        }
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
        C87412m.m108594g(view, "view");
        Object tag = view.getTag();
        if (tag instanceof C95787g0) {
            C95787g0 g0Var = (C95787g0) tag;
            TimeLineObject timeLineObject = g0Var.f279450a;
            int i = timeLineObject.ContentObj.f298424e;
            if (i == 10 || i == 17 || i == 22 || i == 23) {
                SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
                return false;
            }
            this.f287435d.mo137312e().mo133554b(view, g0Var.f279451b, timeLineObject);
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
        return false;
    }
}
