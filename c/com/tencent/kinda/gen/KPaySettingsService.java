package com.tencent.kinda.gen;

import java.util.ArrayList;

public interface KPaySettingsService {
    void commitHbRefundWayTypeChange();

    void commitTransferDelayTypeChange();

    KHbRefundWayType getHbRefundWayType();

    boolean getReddotStatus(String str);

    KTransferDelayType getTransferDelayType();

    int getTransferPhoneGrantFlag();

    KXMLPayRedDot getUnexpiredXMLReddot(String str);

    void handlePushBioPaySettingPageImpl(VoidCallback voidCallback);

    boolean isBioPayTypeEnabled(KBioPayType kBioPayType);

    void logGeneralUserAction(int i);

    void markReddotConsumed(String str);

    void markXMLReddotConsumed(String str);

    void setBioPayTypeEnabledImpl(KBioPayType kBioPayType, boolean z, VoidBoolCallback voidBoolCallback);

    void setHbRefundWayType(KHbRefundWayType kHbRefundWayType);

    void setTransferDelayType(KTransferDelayType kTransferDelayType);

    void setTransferPhoneGrantFlag(int i);

    ArrayList<KBioPayType> supportedBioPayTypes();
}
