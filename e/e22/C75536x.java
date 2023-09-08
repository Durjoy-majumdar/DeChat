package e22;

import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelSelectUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: e22.x */
public class C75536x implements MMTagPanel.C73201i {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelSelectUI f221928d;

    public C75536x(ContactLabelSelectUI contactLabelSelectUI) {
        this.f221928d = contactLabelSelectUI;
    }

    /* renamed from: a */
    public void mo94790a(String str) {
        Log.m105919d("MicroMsg.Label.ContactLabelSelectUI", "[Input onTagRemove] tag:%s", str);
    }

    /* renamed from: b */
    public void mo94791b(String str) {
        Log.m105919d("MicroMsg.Label.ContactLabelSelectUI", "[Input onTagCreate] tag:%s", str + "");
    }

    /* renamed from: d */
    public void mo94792d(String str) {
        Log.m105919d("MicroMsg.Label.ContactLabelSelectUI", "[Input onTagUnSelected] tag:%s", str);
        String str2 = this.f221928d.f198583H.get(str);
        if (Util.isNullOrNil(str2)) {
            Log.m105921e("MicroMsg.Label.ContactLabelSelectUI", "onTagUnSelected:get id failed, name=%s", str);
            return;
        }
        ContactLabelSelectUI.m81375I7(this.f221928d, str2, true);
    }

    /* renamed from: g */
    public void mo94794g() {
        Log.m105918d("MicroMsg.Label.ContactLabelSelectUI", "cpan[Input onTagEditTextClick]");
    }

    /* renamed from: h */
    public void mo94799h(String str) {
        Log.m105919d("MicroMsg.Label.ContactLabelSelectUI", "cpan[Input onTagEditTextChange] curText:%s", str);
    }

    /* renamed from: i */
    public void mo94800i(String str) {
        Log.m105919d("MicroMsg.Label.ContactLabelSelectUI", "[Input onTagSelected] tag:%s", str);
    }

    /* renamed from: j */
    public void mo94801j(boolean z, int i) {
        Log.m105919d("MicroMsg.Label.ContactLabelSelectUI", "[Input onTagLengthMax] match:%s exceedCount:%d", z + "", Integer.valueOf(i));
    }
}
