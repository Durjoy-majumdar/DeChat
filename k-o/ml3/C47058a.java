package ml3;

import android.graphics.Point;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.conversation.BaseConversationUI;
import com.tencent.p014mm.p136ui.conversation.C44947a1;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;
import qo3.C89779i0;
import rb0.C48009v0;
import sb0.C48327a;
import sb0.C48334c;
import sb0.C48340e;
import sb0.C48353j;
import te3.C51960xe;
import uo3.C78253a;

/* renamed from: ml3.a */
public class C47058a implements C47079n {

    /* renamed from: d */
    public BaseConversationUI f126470d;

    /* renamed from: e */
    public C47061c f126471e;

    /* renamed from: f */
    public long f126472f;

    /* renamed from: g */
    public final C47060b f126473g = new C47060b((C47059a) null);

    /* renamed from: ml3.a$b */
    public class C47060b implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public C11184p0 f126474d;

        /* renamed from: e */
        public C78253a f126475e;

        /* renamed from: f */
        public boolean f126476f = false;

        /* renamed from: g */
        public C89779i0 f126477g;

        /* renamed from: h */
        public C48327a f126478h;

        /* renamed from: i */
        public String f126479i;

        /* renamed from: j */
        public long f126480j;

        public C47060b(C47059a aVar) {
        }

        /* renamed from: a */
        public static void m52376a(C47060b bVar, boolean z, int i) {
            bVar.getClass();
            C48334c a0 = C48009v0.Ax0().mo73042a0(bVar.f126480j);
            if (C48340e.m53675p(a0.field_bizChatServId)) {
                if (z) {
                    a0.field_bitFlag |= i;
                } else {
                    a0.field_bitFlag &= ~i;
                }
                Log.m105925i("BizChatConversationPresenter", "dealSetMute:bitFlag %s", Integer.valueOf(a0.field_bitFlag));
                C48009v0.Ax0().mo73040Ow(a0);
            } else {
                C48353j jVar = C48009v0.Bx0().get(a0.field_bizChatServId);
                if (jVar != null) {
                    if (z) {
                        jVar.field_bitFlag |= i;
                    } else {
                        jVar.field_bitFlag &= ~i;
                    }
                    C48009v0.Bx0().mo73075Lo(jVar);
                    a0.field_bitFlag = jVar.field_bitFlag;
                    C48009v0.Ax0().mo73040Ow(a0);
                } else {
                    return;
                }
            }
            C51960xe xeVar = new C51960xe();
            xeVar.f144611d = a0.field_bizChatServId;
            xeVar.f144616i = a0.field_bitFlag;
            C48009v0.yx0().mo73067m(a0.field_brandUserName, xeVar, new C47062b(bVar));
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            if (this.f126478h.field_unReadCount <= 0) {
                contextMenu.add(adapterContextMenuInfo.position, 1, 1, C0966R.string.f361010gm2);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 2, 1, C0966R.string.f361008gm0);
            }
            if (C48009v0.Dx0().mo73026bF(this.f126478h)) {
                contextMenu.add(adapterContextMenuInfo.position, 3, 2, C0966R.string.f361011gm3);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 3, 2, C0966R.string.f361009gm1);
            }
            contextMenu.add(adapterContextMenuInfo.position, 0, 3, C0966R.string.gm7);
        }
    }

    /* renamed from: ml3.a$c */
    public interface C47061c {
    }

    public C47058a(BaseConversationUI baseConversationUI, C47061c cVar) {
        this.f126470d = baseConversationUI;
        this.f126471e = cVar;
    }

    /* renamed from: a */
    public boolean mo72211a(View view, Point point, int i, long j, C44947a1.C44951d dVar) {
        C48327a aVar = dVar.f121943d;
        if (aVar == null) {
            return false;
        }
        C47060b bVar = this.f126473g;
        int i2 = point.x;
        int i3 = point.y;
        if (bVar.f126475e == null) {
            bVar.f126474d = new C47063c(bVar);
            bVar.f126475e = new C78253a(C47058a.this.f126470d);
        }
        bVar.f126478h = aVar;
        bVar.f126479i = aVar.field_brandUserName;
        bVar.f126480j = aVar.field_bizChatId;
        bVar.f126475e.mo108272g(view, i, j, bVar, bVar.f126474d, i2, i3);
        return true;
    }

    /* renamed from: b */
    public void mo72212b(C44947a1.C44951d dVar) {
        C48327a aVar = dVar.f121943d;
        if (aVar != null) {
            String str = aVar.field_brandUserName;
            long j = aVar.field_bizChatId;
            if (str != null) {
                this.f126472f = j;
                Bundle bundle = new Bundle();
                bundle.putLong("key_biz_chat_id", j);
                bundle.putBoolean("key_need_send_video", false);
                bundle.putBoolean("key_is_biz_chat", true);
                this.f126470d.startChatting(str, bundle, true);
            }
        }
    }
}
