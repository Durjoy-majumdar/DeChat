package com.tencent.p014mm.plugin.webview.jsapi.exdevice;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExDeviceOPFromJSAPIEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOnBluetoothStateChangeEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOnRecvDataFromDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOnScanDeviceResultEvent;
import com.tencent.p014mm.autogen.events.ExDeviceScanDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSetSendDataDirectionEvent;
import com.tencent.p014mm.autogen.events.OpFromExDeviceEvent;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6684b2;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.jsapi.exdevice.WebViewExDeviceMgr */
public class WebViewExDeviceMgr implements C6684b2.C6685a {

    /* renamed from: f */
    public static WebViewExDeviceMgr f22062f;

    /* renamed from: a */
    public WVExDeviceEventListener f22063a;

    /* renamed from: b */
    public boolean f22064b = false;

    /* renamed from: c */
    public String f22065c;

    /* renamed from: d */
    public int f22066d = -1;

    /* renamed from: e */
    public boolean f22067e = false;

    /* renamed from: com.tencent.mm.plugin.webview.jsapi.exdevice.WebViewExDeviceMgr$WVExDeviceEventListener */
    public static class WVExDeviceEventListener {

        /* renamed from: a */
        public C6107m f22068a = null;

        /* renamed from: b */
        public String f22069b = "";

        /* renamed from: c */
        public IListener f22070c;

        /* renamed from: d */
        public IListener f22071d;

        /* renamed from: e */
        public IListener f22072e;

        /* renamed from: f */
        public IListener f22073f;

        /* renamed from: g */
        public IListener f22074g;

        public WVExDeviceEventListener(C6107m mVar, String str) {
            C40008f fVar = C40008f.f107254d;
            this.f22070c = new IListener<ExDeviceOnScanDeviceResultEvent>(fVar) {
                {
                    this.__eventId = -903193774;
                }

                public boolean callback(IEvent iEvent) {
                    return WVExDeviceEventListener.m5590a(WVExDeviceEventListener.this, (ExDeviceOnScanDeviceResultEvent) iEvent);
                }
            };
            this.f22071d = new IListener<ExDeviceOnRecvDataFromDeviceEvent>(fVar) {
                {
                    this.__eventId = -1671246574;
                }

                public boolean callback(IEvent iEvent) {
                    return WVExDeviceEventListener.m5590a(WVExDeviceEventListener.this, (ExDeviceOnRecvDataFromDeviceEvent) iEvent);
                }
            };
            this.f22072e = new IListener<ExDeviceOnDeviceBindStateChangeEvent>(fVar) {
                {
                    this.__eventId = 1424330308;
                }

                public boolean callback(IEvent iEvent) {
                    return WVExDeviceEventListener.m5590a(WVExDeviceEventListener.this, (ExDeviceOnDeviceBindStateChangeEvent) iEvent);
                }
            };
            this.f22073f = new IListener<OpFromExDeviceEvent>(fVar) {
                {
                    this.__eventId = 1739921302;
                }

                public boolean callback(IEvent iEvent) {
                    return WVExDeviceEventListener.m5590a(WVExDeviceEventListener.this, (OpFromExDeviceEvent) iEvent);
                }
            };
            this.f22074g = new IListener<ExDeviceOnBluetoothStateChangeEvent>(fVar) {
                {
                    this.__eventId = -1539174833;
                }

                public boolean callback(IEvent iEvent) {
                    return WVExDeviceEventListener.m5590a(WVExDeviceEventListener.this, (ExDeviceOnBluetoothStateChangeEvent) iEvent);
                }
            };
            this.f22068a = mVar;
            this.f22069b = str;
        }

        /* renamed from: a */
        public static boolean m5590a(WVExDeviceEventListener wVExDeviceEventListener, IEvent iEvent) {
            if (iEvent == null) {
                wVExDeviceEventListener.getClass();
                return false;
            } else if (wVExDeviceEventListener.f22068a == null) {
                Log.m105920e("MicroMsg.webview.WebViewExDeviceMgr", "callbacker is null");
                return false;
            } else {
                try {
                    if (iEvent instanceof ExDeviceOnScanDeviceResultEvent) {
                        Log.m105924i("MicroMsg.webview.WebViewExDeviceMgr", "ExDeviceOnScanDeviceResultEvent");
                        ExDeviceOnScanDeviceResultEvent exDeviceOnScanDeviceResultEvent = (ExDeviceOnScanDeviceResultEvent) iEvent;
                        Bundle bundle = new Bundle();
                        bundle.putString("exdevice_device_id", exDeviceOnScanDeviceResultEvent.f107471d.f107472a);
                        bundle.putByteArray("exdevice_broadcast_data", exDeviceOnScanDeviceResultEvent.f107471d.f107473b);
                        bundle.putBoolean("exdevice_is_complete", exDeviceOnScanDeviceResultEvent.f107471d.f107474c);
                        wVExDeviceEventListener.f22068a.callback(15, bundle);
                        return true;
                    }
                    if (iEvent instanceof ExDeviceOnRecvDataFromDeviceEvent) {
                        Log.m105924i("MicroMsg.webview.WebViewExDeviceMgr", "ExDeviceOnRecvDataFromDeviceEvent");
                        ExDeviceOnRecvDataFromDeviceEvent exDeviceOnRecvDataFromDeviceEvent = (ExDeviceOnRecvDataFromDeviceEvent) iEvent;
                        if (!Util.isNullOrNil(exDeviceOnRecvDataFromDeviceEvent.f107467d.f107469b) && !Util.isNullOrNil(exDeviceOnRecvDataFromDeviceEvent.f107467d.f107468a)) {
                            if (exDeviceOnRecvDataFromDeviceEvent.f107467d.f107470c != null) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("exdevice_device_id", exDeviceOnRecvDataFromDeviceEvent.f107467d.f107469b);
                                bundle2.putByteArray("exdevice_data", exDeviceOnRecvDataFromDeviceEvent.f107467d.f107470c);
                                bundle2.putString("exdevice_brand_name", exDeviceOnRecvDataFromDeviceEvent.f107467d.f107468a);
                                wVExDeviceEventListener.f22068a.callback(16, bundle2);
                            }
                        }
                    } else if (iEvent instanceof ExDeviceOnDeviceBindStateChangeEvent) {
                        Log.m105918d("MicroMsg.webview.WebViewExDeviceMgr", "ExDeviceOnDeviceBindStateChangeEvent");
                        ExDeviceOnDeviceBindStateChangeEvent exDeviceOnDeviceBindStateChangeEvent = (ExDeviceOnDeviceBindStateChangeEvent) iEvent;
                        if (!Util.isNullOrNil(exDeviceOnDeviceBindStateChangeEvent.f107464d.f107465a)) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("exdevice_device_id", exDeviceOnDeviceBindStateChangeEvent.f107464d.f107465a);
                            bundle3.putBoolean("exdevice_is_bound", exDeviceOnDeviceBindStateChangeEvent.f107464d.f107466b);
                            wVExDeviceEventListener.f22068a.callback(17, bundle3);
                        }
                    } else if (iEvent instanceof OpFromExDeviceEvent) {
                        OpFromExDeviceEvent opFromExDeviceEvent = (OpFromExDeviceEvent) iEvent;
                        OpFromExDeviceEvent.C40149a aVar = opFromExDeviceEvent.f107677d;
                        if (aVar.f107678a == 2) {
                            if (!Util.isNullOrNil(aVar.f107680c)) {
                                if (wVExDeviceEventListener.f22069b.equals(opFromExDeviceEvent.f107677d.f107680c)) {
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putString("exdevice_device_id", opFromExDeviceEvent.f107677d.f107679b);
                                    bundle4.putInt("exdevice_on_state_change_state", opFromExDeviceEvent.f107677d.f107682e);
                                    wVExDeviceEventListener.f22068a.callback(1004, bundle4);
                                }
                            }
                        }
                    } else if (iEvent instanceof ExDeviceOnBluetoothStateChangeEvent) {
                        Bundle bundle5 = new Bundle();
                        if (((ExDeviceOnBluetoothStateChangeEvent) iEvent).f107462d.f107463a == 12) {
                            bundle5.putBoolean("exdevice_bt_state", true);
                        } else {
                            bundle5.putBoolean("exdevice_bt_state", false);
                        }
                        wVExDeviceEventListener.f22068a.callback(18, bundle5);
                    }
                    return true;
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.webview.WebViewExDeviceMgr", "exception in WVExDeviceEventListener callback, %s", e.getMessage());
                }
            }
        }
    }

    /* renamed from: d */
    public static WebViewExDeviceMgr m5585d() {
        if (f22062f == null) {
            f22062f = new WebViewExDeviceMgr();
        }
        return f22062f;
    }

    /* renamed from: a */
    public void mo6909a(Context context) {
    }

    /* renamed from: b */
    public void mo6910b(Context context) {
        Log.m105925i("MicroMsg.webview.WebViewExDeviceMgr", "stopPlugin, isScaning = %s", Boolean.valueOf(this.f22067e));
        if (this.f22067e) {
            ExDeviceScanDeviceEvent exDeviceScanDeviceEvent = new ExDeviceScanDeviceEvent();
            ExDeviceScanDeviceEvent.C1022a aVar = exDeviceScanDeviceEvent.f9114d;
            aVar.f9117b = false;
            aVar.f9116a = this.f22065c;
            exDeviceScanDeviceEvent.publish();
            if (!exDeviceScanDeviceEvent.f9115e.f9119a) {
                Log.m105920e("MicroMsg.webview.WebViewExDeviceMgr", "stopScanWXDevice fail");
            }
            this.f22067e = false;
        }
        this.f22064b = false;
        WVExDeviceEventListener wVExDeviceEventListener = this.f22063a;
        if (wVExDeviceEventListener != null) {
            wVExDeviceEventListener.f22070c.dead();
            this.f22063a.f22071d.dead();
            this.f22063a.f22073f.dead();
            this.f22063a.f22072e.dead();
            this.f22063a.f22074g.dead();
            this.f22063a = null;
        }
        ExDeviceSetSendDataDirectionEvent exDeviceSetSendDataDirectionEvent = new ExDeviceSetSendDataDirectionEvent();
        ExDeviceSetSendDataDirectionEvent.C1028a aVar2 = exDeviceSetSendDataDirectionEvent.f9132d;
        aVar2.f9134a = "";
        aVar2.f9135b = 0;
        aVar2.f9136c = true;
        exDeviceSetSendDataDirectionEvent.publish();
        Log.m105925i("MicroMsg.webview.WebViewExDeviceMgr", "stop EcDeviceMgr for webview %s", Boolean.valueOf(exDeviceSetSendDataDirectionEvent.f9133e.f9137a));
    }

    /* renamed from: c */
    public void mo6911c(Context context) {
    }

    /* renamed from: e */
    public void mo6912e(C6107m mVar, String str) {
        Log.m105924i("MicroMsg.webview.WebViewExDeviceMgr", "tryInit");
        if (this.f22063a == null) {
            WVExDeviceEventListener wVExDeviceEventListener = new WVExDeviceEventListener(mVar, str);
            this.f22063a = wVExDeviceEventListener;
            wVExDeviceEventListener.f22070c.alive();
            this.f22063a.f22071d.alive();
            this.f22063a.f22073f.alive();
            this.f22063a.f22072e.alive();
            this.f22063a.f22074g.alive();
        }
        ExDeviceOPFromJSAPIEvent exDeviceOPFromJSAPIEvent = new ExDeviceOPFromJSAPIEvent();
        exDeviceOPFromJSAPIEvent.f9110d.f9111a = 1;
        exDeviceOPFromJSAPIEvent.publish();
        this.f22064b = true;
        this.f22065c = str;
    }

    public String getName() {
        return "WebViewExDeviceMgr";
    }
}
