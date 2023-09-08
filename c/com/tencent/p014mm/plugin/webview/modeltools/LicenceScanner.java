package com.tencent.p014mm.plugin.webview.modeltools;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScanBankCardConfirmResultEvent;
import com.tencent.p014mm.autogen.events.ScanCardResultEvent;
import com.tencent.p014mm.autogen.events.ScanQRCodeOprationEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.LicenceScanner */
public final class LicenceScanner {

    /* renamed from: a */
    public String f22377a = null;

    /* renamed from: b */
    public C6075a f22378b;

    /* renamed from: c */
    public IListener f22379c;

    /* renamed from: d */
    public IListener f22380d;

    /* renamed from: e */
    public IListener f22381e;

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.LicenceScanner$a */
    public interface C6075a {
        /* renamed from: a */
        void mo7014a(String str);

        /* renamed from: b */
        void mo7015b(String str);

        /* renamed from: c */
        void mo7016c(String str, JSONObject jSONObject, Bitmap bitmap);
    }

    public LicenceScanner() {
        C40008f fVar = C40008f.f107254d;
        this.f22379c = new IListener<ScanQRCodeOprationEvent>(fVar) {
            {
                this.__eventId = 2058274619;
            }

            public boolean callback(IEvent iEvent) {
                ScanQRCodeOprationEvent scanQRCodeOprationEvent = (ScanQRCodeOprationEvent) iEvent;
                if (!(scanQRCodeOprationEvent instanceof ScanQRCodeOprationEvent) || scanQRCodeOprationEvent.f9472d.f9473a != 1) {
                    return false;
                }
                LicenceScanner licenceScanner = LicenceScanner.this;
                String str = licenceScanner.f22377a;
                C6075a aVar = licenceScanner.f22378b;
                if (aVar != null) {
                    aVar.mo7014a(str);
                }
                LicenceScanner.m5942a(LicenceScanner.this);
                return false;
            }
        };
        this.f22380d = new IListener<ScanBankCardConfirmResultEvent>(fVar) {
            {
                this.__eventId = 582289590;
            }

            public boolean callback(IEvent iEvent) {
                ScanBankCardConfirmResultEvent scanBankCardConfirmResultEvent = (ScanBankCardConfirmResultEvent) iEvent;
                if ((scanBankCardConfirmResultEvent instanceof ScanBankCardConfirmResultEvent) && "bank".equals(LicenceScanner.this.f22377a)) {
                    ScanBankCardConfirmResultEvent.C1125a aVar = scanBankCardConfirmResultEvent.f9461d;
                    int i = aVar.f9463b;
                    if (i == 0) {
                        LicenceScanner licenceScanner = LicenceScanner.this;
                        String str = licenceScanner.f22377a;
                        C6075a aVar2 = licenceScanner.f22378b;
                        if (aVar2 != null) {
                            aVar2.mo7014a(str);
                        }
                    } else if (i == 1) {
                        if (Util.isNullOrNil(aVar.f9462a)) {
                            LicenceScanner licenceScanner2 = LicenceScanner.this;
                            String str2 = licenceScanner2.f22377a;
                            C6075a aVar3 = licenceScanner2.f22378b;
                            if (aVar3 != null) {
                                aVar3.mo7015b(str2);
                            }
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("bankcard_number", scanBankCardConfirmResultEvent.f9461d.f9462a);
                                LicenceScanner licenceScanner3 = LicenceScanner.this;
                                String str3 = licenceScanner3.f22377a;
                                C6075a aVar4 = licenceScanner3.f22378b;
                                if (aVar4 != null) {
                                    aVar4.mo7016c(str3, jSONObject, (Bitmap) null);
                                }
                            } catch (JSONException e) {
                                Log.m105921e("MicroMsg.LicenceScanner", "type = bankcard, add cardNum into json, exp = %s ", e);
                                LicenceScanner licenceScanner4 = LicenceScanner.this;
                                String str4 = licenceScanner4.f22377a;
                                C6075a aVar5 = licenceScanner4.f22378b;
                                if (aVar5 != null) {
                                    aVar5.mo7015b(str4);
                                }
                            }
                        }
                    }
                    LicenceScanner.m5942a(LicenceScanner.this);
                }
                return false;
            }
        };
        this.f22381e = new IListener<ScanCardResultEvent>(fVar) {
            {
                this.__eventId = 630715104;
            }

            public boolean callback(IEvent iEvent) {
                ScanCardResultEvent scanCardResultEvent = (ScanCardResultEvent) iEvent;
                if ((scanCardResultEvent instanceof ScanCardResultEvent) && LicenceScanner.this.f22377a.equalsIgnoreCase(scanCardResultEvent.f9468d.f9469a)) {
                    int i = scanCardResultEvent.f9468d.f9470b;
                    if (i == 0) {
                        LicenceScanner licenceScanner = LicenceScanner.this;
                        String str = licenceScanner.f22377a;
                        C6075a aVar = licenceScanner.f22378b;
                        if (aVar != null) {
                            aVar.mo7015b(str);
                        }
                    } else if (i == 2) {
                        LicenceScanner licenceScanner2 = LicenceScanner.this;
                        String str2 = licenceScanner2.f22377a;
                        C6075a aVar2 = licenceScanner2.f22378b;
                        if (aVar2 != null) {
                            aVar2.mo7014a(str2);
                        }
                    } else {
                        try {
                            if (!Util.isNullOrNil((String) null)) {
                                scanCardResultEvent.f9468d.getClass();
                                JSONObject jSONObject = new JSONObject((String) null);
                                LicenceScanner licenceScanner3 = LicenceScanner.this;
                                String str3 = licenceScanner3.f22377a;
                                Bitmap bitmap = scanCardResultEvent.f9468d.f9471c;
                                C6075a aVar3 = licenceScanner3.f22378b;
                                if (aVar3 != null) {
                                    aVar3.mo7016c(str3, jSONObject, bitmap);
                                }
                            } else {
                                LicenceScanner licenceScanner4 = LicenceScanner.this;
                                String str4 = licenceScanner4.f22377a;
                                Bitmap bitmap2 = scanCardResultEvent.f9468d.f9471c;
                                C6075a aVar4 = licenceScanner4.f22378b;
                                if (aVar4 != null) {
                                    aVar4.mo7016c(str4, (JSONObject) null, bitmap2);
                                }
                            }
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.LicenceScanner", "Failed to parse json string: %s", e.getMessage());
                            LicenceScanner licenceScanner5 = LicenceScanner.this;
                            String str5 = licenceScanner5.f22377a;
                            C6075a aVar5 = licenceScanner5.f22378b;
                            if (aVar5 != null) {
                                aVar5.mo7015b(str5);
                            }
                        }
                    }
                    LicenceScanner.m5942a(LicenceScanner.this);
                }
                return false;
            }
        };
    }

    /* renamed from: a */
    public static void m5942a(LicenceScanner licenceScanner) {
        licenceScanner.f22378b = null;
        licenceScanner.f22379c.dead();
        licenceScanner.f22380d.dead();
        licenceScanner.f22381e.dead();
    }

    /* renamed from: b */
    public boolean mo7013b(String str, Context context, C6075a aVar) {
        if ("bank".equalsIgnoreCase(str)) {
            Intent intent = new Intent();
            intent.putExtra("BaseScanUI_select_scan_mode", 7);
            intent.putExtra("scan_bankcard_with_confirm_ui", true);
            intent.addFlags(268435456);
            C88144b.m109791i(context, "scanner", ".ui.ScanCardUI", intent, (Bundle) null);
            this.f22378b = aVar;
            this.f22377a = "bank";
            this.f22379c.alive();
            this.f22380d.alive();
            return true;
        } else if (!"identity_pay_auth".equalsIgnoreCase(str)) {
            return false;
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("BaseScanUI_select_scan_mode", 11);
            C88144b.m109791i(context, "scanner", ".ui.ScanCardUI", intent2, (Bundle) null);
            this.f22378b = aVar;
            this.f22377a = "identity_pay_auth";
            this.f22379c.alive();
            this.f22381e.alive();
            return true;
        }
    }
}
