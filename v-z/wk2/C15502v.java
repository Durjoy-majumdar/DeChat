package wk2;

import com.tencent.p014mm.plugin.appbrand.jsapi.address.AddressSelectorContract;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: wk2.v */
public final class C15502v extends C87413o implements C32226l<AddressSelectorContract.AddressNode, CharSequence> {

    /* renamed from: d */
    public static final C15502v f42041d = new C15502v();

    public C15502v() {
        super(1);
    }

    public Object invoke(Object obj) {
        AddressSelectorContract.AddressNode addressNode = (AddressSelectorContract.AddressNode) obj;
        C87412m.m108594g(addressNode, LocaleUtil.ITALIAN);
        return addressNode.f11045d + '#' + addressNode.f11046e;
    }
}
