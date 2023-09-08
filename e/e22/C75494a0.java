package e22;

import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI;
import com.tencent.p014mm.plugin.label.p067ui.widget.MMLabelPanel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: e22.a0 */
public class C75494a0 implements MMTagPanel.C73201i {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelUI f221864d;

    public C75494a0(ContactLabelUI contactLabelUI) {
        this.f221864d = contactLabelUI;
    }

    /* renamed from: a */
    public void mo94790a(String str) {
    }

    /* renamed from: b */
    public void mo94791b(String str) {
    }

    /* renamed from: d */
    public void mo94792d(String str) {
        Log.m105919d("MicroMsg.Label.ContactLabelUI", "cpan[All onTagUnSelected] tag:%s", str + "");
        MMLabelPanel mMLabelPanel = this.f221864d.f198656j;
        if (mMLabelPanel != null) {
            mMLabelPanel.mo101812o(str);
        }
        ContactLabelUI.m81393I7(this.f221864d, str);
        if (this.f221864d.mo95156M7()) {
            this.f221864d.enableOptionMenu(true);
        }
        if (this.f221864d.f198647H.contains(str)) {
            this.f221864d.f198647H.remove(str);
        }
    }

    /* renamed from: g */
    public void mo94794g() {
    }

    /* renamed from: h */
    public void mo94799h(String str) {
    }

    /* renamed from: i */
    public void mo94800i(String str) {
        Log.m105919d("MicroMsg.Label.ContactLabelUI", "cpan[All onTagSelected] tag:%s", str + "");
        MMLabelPanel mMLabelPanel = this.f221864d.f198656j;
        if (mMLabelPanel != null) {
            mMLabelPanel.mo95185d(str, true);
        }
        ContactLabelUI contactLabelUI = this.f221864d;
        contactLabelUI.mo95155L7(str, contactLabelUI.f198644E);
        if (this.f221864d.mo95156M7()) {
            this.f221864d.enableOptionMenu(true);
        }
        if (!this.f221864d.f198647H.contains(str)) {
            this.f221864d.f198647H.add(str);
        }
    }

    /* renamed from: j */
    public void mo94801j(boolean z, int i) {
    }
}
