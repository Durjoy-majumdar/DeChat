package com.tencent.p014mm.sdk.platformtools;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion$initSignalStrengthListener$1", "Landroid/telephony/PhoneStateListener;", "Landroid/telephony/SignalStrength;", "signalStrength", "Lrx3/b0;", "onSignalStrengthsChanged", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion$initSignalStrengthListener$1 */
public final class ConnectivityCompat$Companion$initSignalStrengthListener$1 extends PhoneStateListener {
    public final /* synthetic */ int $phoneType;

    public ConnectivityCompat$Companion$initSignalStrengthListener$1(int i) {
        this.$phoneType = i;
    }

    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        C87412m.m108594g(signalStrength, "signalStrength");
        super.onSignalStrengthsChanged(signalStrength);
        ConnectivityCompat.mixedSignalStrength.setPhoneType(this.$phoneType);
        int phoneType = ConnectivityCompat.mixedSignalStrength.getPhoneType();
        if (phoneType == 1) {
            ConnectivityCompat.mixedSignalStrength.setGsmSignalStrength(signalStrength.getGsmSignalStrength());
        } else if (phoneType == 2) {
            ConnectivityCompat.mixedSignalStrength.setCdmaDbm(signalStrength.getCdmaDbm());
        }
    }
}
