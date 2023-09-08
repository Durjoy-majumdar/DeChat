package com.tencent.p014mm.plugin.webview.p128ui.tools.exdevice;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExDeviceLanDeviceConnectStateEvent;
import com.tencent.p014mm.autogen.events.ExDeviceLanDeviceRecvDataEvent;
import com.tencent.p014mm.autogen.events.ExDeviceLanDeviceScanResultEvent;
import com.tencent.p014mm.autogen.events.ExDeviceLanDeviceStateChangeEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOpenLanDeviceLibEvent;
import com.tencent.p014mm.autogen.events.ExDeviceStartScanLanDeviceEvent;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6684b2;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.exdevice.WebViewExDeviceLanMgr */
public class WebViewExDeviceLanMgr implements C6684b2.C6685a {

    /* renamed from: d */
    public static WebViewExDeviceLanMgr f22611d;

    /* renamed from: a */
    public WVExDeviceEventListener f22612a;

    /* renamed from: b */
    public boolean f22613b = false;

    /* renamed from: c */
    public boolean f22614c = false;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.exdevice.WebViewExDeviceLanMgr$WVExDeviceEventListener */
    public static class WVExDeviceEventListener {

        /* renamed from: a */
        public C6107m f22615a = null;

        /* renamed from: b */
        public String f22616b = "";

        /* renamed from: c */
        public IListener f22617c;

        /* renamed from: d */
        public IListener f22618d;

        /* renamed from: e */
        public IListener f22619e;

        /* renamed from: f */
        public IListener f22620f;

        /* renamed from: g */
        public IListener f22621g;

        public WVExDeviceEventListener(int i, C6107m mVar, String str) {
            C40008f fVar = C40008f.f107254d;
            this.f22617c = new IListener<ExDeviceOnDeviceBindStateChangeEvent>(fVar) {
                {
                    this.__eventId = 1424330308;
                }

                public boolean callback(IEvent iEvent) {
                    return WVExDeviceEventListener.m6051a(WVExDeviceEventListener.this, (ExDeviceOnDeviceBindStateChangeEvent) iEvent);
                }
            };
            this.f22618d = new IListener<ExDeviceLanDeviceConnectStateEvent>(fVar) {
                {
                    this.__eventId = -545145475;
                }

                public boolean callback(IEvent iEvent) {
                    return WVExDeviceEventListener.m6051a(WVExDeviceEventListener.this, (ExDeviceLanDeviceConnectStateEvent) iEvent);
                }
            };
            this.f22619e = new IListener<ExDeviceLanDeviceRecvDataEvent>(fVar) {
                {
                    this.__eventId = 444149556;
                }

                public boolean callback(IEvent iEvent) {
                    return WVExDeviceEventListener.m6051a(WVExDeviceEventListener.this, (ExDeviceLanDeviceRecvDataEvent) iEvent);
                }
            };
            this.f22620f = new IListener<ExDeviceLanDeviceScanResultEvent>(fVar) {
                {
                    this.__eventId = 1700482218;
                }

                public boolean callback(IEvent iEvent) {
                    return WVExDeviceEventListener.m6051a(WVExDeviceEventListener.this, (ExDeviceLanDeviceScanResultEvent) iEvent);
                }
            };
            this.f22621g = new IListener<ExDeviceLanDeviceStateChangeEvent>(fVar) {
                {
                    this.__eventId = -536673841;
                }

                public boolean callback(IEvent iEvent) {
                    return WVExDeviceEventListener.m6051a(WVExDeviceEventListener.this, (ExDeviceLanDeviceStateChangeEvent) iEvent);
                }
            };
            this.f22615a = mVar;
            this.f22616b = str;
        }

        /* renamed from: a */
        public static boolean m6051a(WVExDeviceEventListener wVExDeviceEventListener, IEvent iEvent) {
            if (iEvent == null) {
                wVExDeviceEventListener.getClass();
                return false;
            } else if (wVExDeviceEventListener.f22615a == null) {
                Log.m105920e("MicroMsg.webview.WebViewExDeviceLanMgr", "callbacker is null");
                return false;
            } else {
                try {
                    if (iEvent instanceof ExDeviceOnDeviceBindStateChangeEvent) {
                        Log.m105918d("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceOnDeviceBindStateChangeEvent");
                        ExDeviceOnDeviceBindStateChangeEvent exDeviceOnDeviceBindStateChangeEvent = (ExDeviceOnDeviceBindStateChangeEvent) iEvent;
                        if (!Util.isNullOrNil(exDeviceOnDeviceBindStateChangeEvent.f107464d.f107465a)) {
                            Bundle bundle = new Bundle();
                            bundle.putString("exdevice_device_id", exDeviceOnDeviceBindStateChangeEvent.f107464d.f107465a);
                            bundle.putBoolean("exdevice_is_bound", exDeviceOnDeviceBindStateChangeEvent.f107464d.f107466b);
                            wVExDeviceEventListener.f22615a.callback(17, bundle);
                        }
                        return true;
                    } else if (iEvent instanceof ExDeviceLanDeviceConnectStateEvent) {
                        Log.m105918d("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceConnectStateEvent");
                        ExDeviceLanDeviceConnectStateEvent exDeviceLanDeviceConnectStateEvent = (ExDeviceLanDeviceConnectStateEvent) iEvent;
                        if (!Util.isNullOrNil(exDeviceLanDeviceConnectStateEvent.f9103d.f9104a)) {
                            if (wVExDeviceEventListener.f22616b.equals(exDeviceLanDeviceConnectStateEvent.f9103d.f9106c)) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("exdevice_device_id", exDeviceLanDeviceConnectStateEvent.f9103d.f9104a);
                                bundle2.putInt("exdevice_on_state_change_state", exDeviceLanDeviceConnectStateEvent.f9103d.f9105b);
                                bundle2.putString("exdevice_device_type", "lan");
                                wVExDeviceEventListener.f22615a.callback(1004, bundle2);
                            }
                        }
                        return true;
                    } else {
                        if (iEvent instanceof ExDeviceLanDeviceRecvDataEvent) {
                            Log.m105918d("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceRecvDataEvent");
                            ExDeviceLanDeviceRecvDataEvent exDeviceLanDeviceRecvDataEvent = (ExDeviceLanDeviceRecvDataEvent) iEvent;
                            if (!Util.isNullOrNil(exDeviceLanDeviceRecvDataEvent.f343551d.f343553b) && !Util.isNullOrNil(exDeviceLanDeviceRecvDataEvent.f343551d.f343552a)) {
                                if (exDeviceLanDeviceRecvDataEvent.f343551d.f343554c != null) {
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("exdevice_device_id", exDeviceLanDeviceRecvDataEvent.f343551d.f343553b);
                                    bundle3.putByteArray("exdevice_data", exDeviceLanDeviceRecvDataEvent.f343551d.f343554c);
                                    bundle3.putString("exdevice_brand_name", exDeviceLanDeviceRecvDataEvent.f343551d.f343552a);
                                    bundle3.putString("exdevice_device_type", "lan");
                                    wVExDeviceEventListener.f22615a.callback(16, bundle3);
                                }
                            }
                        } else if (iEvent instanceof ExDeviceLanDeviceScanResultEvent) {
                            Log.m105924i("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceScanResultEvent");
                            ExDeviceLanDeviceScanResultEvent exDeviceLanDeviceScanResultEvent = (ExDeviceLanDeviceScanResultEvent) iEvent;
                            Bundle bundle4 = new Bundle();
                            bundle4.putString("exdevice_device_id", exDeviceLanDeviceScanResultEvent.f9107d.f9108a);
                            bundle4.putByteArray("exdevice_broadcast_data", exDeviceLanDeviceScanResultEvent.f9107d.f9109b);
                            exDeviceLanDeviceScanResultEvent.f9107d.getClass();
                            bundle4.putBoolean("exdevice_is_complete", false);
                            bundle4.putBoolean("exdevice_is_lan_device", true);
                            bundle4.putString("exdevice_device_type", "lan");
                            wVExDeviceEventListener.f22615a.callback(15, bundle4);
                        } else if (iEvent instanceof ExDeviceLanDeviceStateChangeEvent) {
                            Log.m105924i("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceStateChangeEvent");
                            Bundle bundle5 = new Bundle();
                            if (((ExDeviceLanDeviceStateChangeEvent) iEvent).f343555d.f343556a) {
                                bundle5.putBoolean("exdevice_lan_state", true);
                            } else {
                                bundle5.putBoolean("exdevice_lan_state", false);
                            }
                            wVExDeviceEventListener.f22615a.callback(47, bundle5);
                        }
                        return true;
                    }
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.webview.WebViewExDeviceLanMgr", "exception in WVExDeviceEventListener callback, %s", e.getMessage());
                }
            }
        }
    }

    /* renamed from: d */
    public static WebViewExDeviceLanMgr m6046d() {
        if (f22611d == null) {
            f22611d = new WebViewExDeviceLanMgr();
        }
        return f22611d;
    }

    /* renamed from: a */
    public void mo6909a(Context context) {
    }

    /* renamed from: b */
    public void mo6910b(Context context) {
        Log.m105925i("MicroMsg.webview.WebViewExDeviceLanMgr", "stopPlugin, isScaning = %s", Boolean.valueOf(this.f22614c));
        if (this.f22614c) {
            ExDeviceStartScanLanDeviceEvent exDeviceStartScanLanDeviceEvent = new ExDeviceStartScanLanDeviceEvent();
            exDeviceStartScanLanDeviceEvent.f9138d.f9139a = false;
            exDeviceStartScanLanDeviceEvent.publish();
            this.f22614c = false;
        }
        this.f22613b = false;
        WVExDeviceEventListener wVExDeviceEventListener = this.f22612a;
        if (wVExDeviceEventListener != null) {
            wVExDeviceEventListener.f22617c.dead();
            this.f22612a.f22618d.dead();
            this.f22612a.f22620f.dead();
            this.f22612a.f22619e.dead();
            this.f22612a.f22621g.dead();
            this.f22612a = null;
        }
        ExDeviceOpenLanDeviceLibEvent exDeviceOpenLanDeviceLibEvent = new ExDeviceOpenLanDeviceLibEvent();
        exDeviceOpenLanDeviceLibEvent.f9112d.f9113a = false;
        exDeviceOpenLanDeviceLibEvent.publish();
    }

    /* renamed from: c */
    public void mo6911c(Context context) {
    }

    /* renamed from: e */
    public void mo7119e(C6107m mVar, String str) {
        Log.m105924i("MicroMsg.webview.WebViewExDeviceLanMgr", "tryInit");
        if (this.f22612a == null) {
            WVExDeviceEventListener wVExDeviceEventListener = new WVExDeviceEventListener(0, mVar, str);
            this.f22612a = wVExDeviceEventListener;
            wVExDeviceEventListener.f22617c.alive();
            this.f22612a.f22618d.alive();
            this.f22612a.f22620f.alive();
            this.f22612a.f22619e.alive();
            this.f22612a.f22621g.alive();
        }
        ExDeviceOpenLanDeviceLibEvent exDeviceOpenLanDeviceLibEvent = new ExDeviceOpenLanDeviceLibEvent();
        exDeviceOpenLanDeviceLibEvent.f9112d.f9113a = true;
        exDeviceOpenLanDeviceLibEvent.publish();
        this.f22613b = true;
    }

    public String getName() {
        return "WebViewExDeviceLanMgr";
    }
}
