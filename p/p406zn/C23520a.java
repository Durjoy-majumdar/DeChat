package p406zn;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.wechat.p326mm.biz.BizProto;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import p007bo.C16801f;
import p007bo.C16813m;
import p227rn.C13089q;
import rb0.C12966g;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@C86522b
/* renamed from: zn.a */
public final class C23520a extends C86301e implements C13089q {

    /* renamed from: d */
    public final C13601g f67458d = C36568h.m40985a(C23521a.f67459d);

    /* renamed from: zn.a$a */
    public static final class C23521a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C23521a f67459d = new C23521a();

        public C23521a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("MagicBrush_CARD_HEIGHT_CACHE_MMKV");
        }
    }

    /* renamed from: H8 */
    public boolean mo12585H8(long j, int i) {
        if (!C16801f.f45399a.mo17845e()) {
            return false;
        }
        return C16813m.f45424a.mo17856b().deleteDynamicCard(j, i);
    }

    public List<C12966g> Z90(int i) {
        if (!C16801f.f45399a.mo17845e()) {
            return new LinkedList();
        }
        BizProto.DynamicCardInfoList allDynamicCardInfo = C16813m.f45424a.mo17856b().getAllDynamicCardInfo(i);
        LinkedList linkedList = new LinkedList();
        List<BizProto.DynamicCardInfoList.DynamicCardInfo> listList = allDynamicCardInfo.getListList();
        C87412m.m108593f(listList, "dynamicCardInfo.listList");
        for (BizProto.DynamicCardInfoList.DynamicCardInfo dynamicCardInfo : listList) {
            long msgId = dynamicCardInfo.getMsgId();
            String frameSetName = dynamicCardInfo.getFrameSetName();
            C87412m.m108593f(frameSetName, "info.frameSetName");
            String frameSetData = dynamicCardInfo.getFrameSetData();
            C87412m.m108593f(frameSetData, "info.frameSetData");
            linkedList.add(new C12966g(msgId, frameSetName, frameSetData, dynamicCardInfo.getPos()));
        }
        return linkedList;
    }

    /* renamed from: bh */
    public boolean mo12587bh(String str, String str2) {
        C87412m.m108594g(str, "adFetchControl");
        C87412m.m108594g(str2, "adFetchInfo");
        if (!C16801f.f45399a.mo17845e()) {
            return false;
        }
        return C16813m.f45424a.mo17856b().setAdRequestInfo(str, str2);
    }

    public void ce0(int i, String str, String str2) {
        C87412m.m108594g(str, "frameSetName");
        C87412m.m108594g(str2, "frameSetData");
        if (C16801f.f45399a.mo17845e()) {
            C16813m.f45424a.mo17856b().mockInsertCanvas(i, str, str2);
        }
    }

    /* renamed from: cz */
    public void mo12589cz(String str, int i) {
        C87412m.m108594g(str, "frameSetName");
        if (i <= 0) {
            ((MultiProcessMMKV) ((C36570n) this.f67458d).getValue()).remove(str);
        } else {
            ((MultiProcessMMKV) ((C36570n) this.f67458d).getValue()).putInt(str, i);
        }
    }

    /* renamed from: lN */
    public int mo12590lN(String str) {
        C87412m.m108594g(str, "frameSetName");
        return ((MultiProcessMMKV) ((C36570n) this.f67458d).getValue()).getInt(str, 0);
    }

    /* renamed from: oZ */
    public boolean mo12591oZ(long j, String str) {
        if (!C16801f.f45399a.mo17845e()) {
            return false;
        }
        return C16813m.f45424a.mo17856b().setAdCardRequestInfo(j, str);
    }
}
