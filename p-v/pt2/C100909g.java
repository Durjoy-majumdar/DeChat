package pt2;

import com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: pt2.g */
public class C100909g implements C100904a {

    /* renamed from: a */
    public WeakReference<SnsMsgUI> f295513a;

    /* renamed from: b */
    public final String f295514b = "MicroMsg.SnsMsgStopRemindPreCheckCallback";

    /* renamed from: c */
    public boolean f295515c;

    public C100909g(SnsMsgUI snsMsgUI) {
        C87412m.m108594g(snsMsgUI, "ui");
        this.f295513a = new WeakReference<>(snsMsgUI);
    }
}
