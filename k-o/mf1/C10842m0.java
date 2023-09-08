package mf1;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: mf1.m0 */
public final class C10842m0 extends C87413o implements C32226l<FinderJumpInfo, CharSequence> {

    /* renamed from: d */
    public static final C10842m0 f32379d = new C10842m0();

    public C10842m0() {
        super(1);
    }

    public Object invoke(Object obj) {
        FinderJumpInfo finderJumpInfo = (FinderJumpInfo) obj;
        C87412m.m108594g(finderJumpInfo, LocaleUtil.ITALIAN);
        String str = finderJumpInfo.jump_id;
        return str == null ? "" : str;
    }
}
