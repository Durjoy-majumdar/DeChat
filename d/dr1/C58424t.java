package dr1;

import android.content.Intent;
import android.os.Bundle;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.pluginsdk.location.C57534a;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C58408t0;
import er1.C58784w3;
import er1.C58790x4;
import fe1.C58964h;
import gy3.C87412m;
import java.util.LinkedList;
import ke3.C88144b;
import os1.C62153d;
import rx3.C13604l;
import te3.C51163rv3;
import te3.C64311db1;
import te3.C64885zm2;

/* renamed from: dr1.t */
public final class C58424t implements C58964h {

    /* renamed from: a */
    public MMActivity f167374a;

    /* renamed from: b */
    public C57534a f167375b;

    /* renamed from: c */
    public int f167376c;

    /* renamed from: d */
    public C64311db1 f167377d;

    /* renamed from: e */
    public Bundle f167378e;

    /* renamed from: f */
    public Intent f167379f;

    /* renamed from: g */
    public boolean f167380g;

    /* renamed from: h */
    public boolean f167381h;

    /* renamed from: dr1.t$a */
    public static final class C58425a implements C57534a.C6645a {

        /* renamed from: a */
        public final /* synthetic */ C58424t f167382a;

        /* renamed from: b */
        public final /* synthetic */ Intent f167383b;

        public C58425a(C58424t tVar, Intent intent) {
            this.f167382a = tVar;
            this.f167383b = intent;
        }

        /* renamed from: a */
        public final void mo7573a() {
            String str;
            String str2;
            Intent intent = new Intent();
            intent.putExtra("near_life_scene", 6);
            C64311db1 db12 = this.f167382a.f167377d;
            float f = 0.0f;
            intent.putExtra("get_lat", db12 != null ? db12.f182662e : 0.0f);
            C64311db1 db13 = this.f167382a.f167377d;
            if (db13 != null) {
                f = db13.f182661d;
            }
            intent.putExtra("get_lng", f);
            C64311db1 db14 = this.f167382a.f167377d;
            String str3 = "";
            if (db14 == null || (str = db14.f182666i) == null) {
                str = str3;
            }
            intent.putExtra("get_poi_classify_id", str);
            C64311db1 db15 = this.f167382a.f167377d;
            if (!(db15 == null || (str2 = db15.f182663f) == null)) {
                str3 = str2;
            }
            intent.putExtra("get_city", str3);
            intent.putExtra("is_force_dark_mode", this.f167383b.getBooleanExtra("is_force_dark_mode", false));
            intent.putExtra("is_force_dark_mode", this.f167383b.getBooleanExtra("is_force_dark_mode", false));
            intent.putExtra("can_show_create_poi_tips", this.f167383b.getBooleanExtra("can_show_create_poi_tips", true));
            intent.putExtra("show_city", this.f167383b.getBooleanExtra("show_city", true));
            intent.putExtra("poi_show_none", this.f167383b.getBooleanExtra("poi_show_none", true));
            C58424t tVar = this.f167382a;
            MMActivity mMActivity = tVar.f167374a;
            if (mMActivity != null) {
                C88144b.m109795m(mMActivity, "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", intent, tVar.f167376c);
                C5139t.m5183e(5, 10);
                return;
            }
            C87412m.m108603p(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            throw null;
        }
    }

    /* renamed from: a */
    public C64311db1 mo83363a() {
        return this.f167377d;
    }

    /* renamed from: b */
    public void mo8612b(Intent intent, Bundle bundle) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(bundle, "postData");
        this.f167379f = intent;
        this.f167378e = bundle;
        C57534a i = mo83370i();
        MMActivity mMActivity = this.f167374a;
        if (mMActivity != null) {
            i.setLocationName(mMActivity.getString(C0966R.string.eaz));
            mo83370i().setOnClickLocationListener(new C58425a(this, intent));
            mo83371k();
            return;
        }
        C87412m.m108603p(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        throw null;
    }

    /* renamed from: c */
    public void mo83364c() {
        if (!this.f167381h) {
            this.f167380g = true;
            mo83370i().mo3293c();
        }
    }

    /* renamed from: d */
    public void mo83365d() {
        this.f167380g = false;
        this.f167381h = true;
        mo83370i().mo3294d();
    }

    /* renamed from: e */
    public void mo83366e(String str, C64885zm2 zm22, C58790x4 x4Var) {
        C87412m.m108594g(zm22, "lbsLife");
        if (this.f167380g) {
            this.f167381h = true;
            int i = -1;
            C64311db1 db12 = null;
            if (Util.isNullOrNil(str)) {
                mo83370i().mo3294d();
                C64311db1 db13 = this.f167377d;
                if (!true || !true) {
                    db12 = db13;
                }
                if (!true || !true) {
                    i = 0;
                }
                FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.lbsFlag = 0;
                    finderFeedReportObject.selectLocation = db12;
                    finderFeedReportObject.recommend_lbs_position = i;
                    return;
                }
                return;
            }
            Intent intent = this.f167379f;
            if (intent != null) {
                intent.putExtra("saveLocation", true);
                Intent intent2 = this.f167379f;
                if (intent2 != null) {
                    intent2.putExtra("get_poi_name", "");
                    Intent intent3 = this.f167379f;
                    if (intent3 != null) {
                        intent3.putExtra("get_city", Util.nullAsNil(str));
                        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
                        Intent intent4 = this.f167379f;
                        if (intent4 != null) {
                            intent4.putExtra("get_lat", ((Number) X0.f38556e).floatValue());
                            Intent intent5 = this.f167379f;
                            if (intent5 != null) {
                                intent5.putExtra("get_lng", ((Number) X0.f38555d).floatValue());
                                Intent intent6 = this.f167379f;
                                if (intent6 != null) {
                                    intent6.putExtra("get_poi_classify_type", zm22.f186738p);
                                    Intent intent7 = this.f167379f;
                                    if (intent7 != null) {
                                        intent7.putExtra("get_poi_classify_id", "");
                                        mo83371k();
                                        C64311db1 db14 = this.f167377d;
                                        if (db14 != null) {
                                            Bundle bundle = this.f167378e;
                                            if (bundle != null) {
                                                bundle.putByteArray("post_location", db14.toByteArray());
                                            } else {
                                                C87412m.m108603p("postData");
                                                throw null;
                                            }
                                        }
                                        mo83370i().setSuggestView(str);
                                        C64311db1 db15 = this.f167377d;
                                        if (!true || !true) {
                                            db12 = db15;
                                        }
                                        if (!true || !true) {
                                            i = 0;
                                        }
                                        FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
                                        if (finderFeedReportObject2 != null) {
                                            finderFeedReportObject2.lbsFlag = 1;
                                            finderFeedReportObject2.selectLocation = db12;
                                            finderFeedReportObject2.recommend_lbs_position = i;
                                            return;
                                        }
                                        return;
                                    }
                                    C87412m.m108603p("intent");
                                    throw null;
                                }
                                C87412m.m108603p("intent");
                                throw null;
                            }
                            C87412m.m108603p("intent");
                            throw null;
                        }
                        C87412m.m108603p("intent");
                        throw null;
                    }
                    C87412m.m108603p("intent");
                    throw null;
                }
                C87412m.m108603p("intent");
                throw null;
            }
            C87412m.m108603p("intent");
            throw null;
        }
    }

    /* renamed from: f */
    public void mo83367f(String str, C64885zm2 zm22, float f, float f2) {
        C87412m.m108594g(zm22, "lbsLife");
        Intent intent = this.f167379f;
        if (intent != null) {
            intent.putExtra("saveLocation", true);
            Intent intent2 = this.f167379f;
            if (intent2 != null) {
                intent2.putExtra("get_poi_name", Util.nullAs(zm22.f186730e, ""));
                Intent intent3 = this.f167379f;
                if (intent3 != null) {
                    intent3.putExtra("get_city", Util.nullAs(str, ""));
                    Intent intent4 = this.f167379f;
                    if (intent4 != null) {
                        intent4.putExtra("get_lat", f2);
                        Intent intent5 = this.f167379f;
                        if (intent5 != null) {
                            intent5.putExtra("get_lng", f);
                            Intent intent6 = this.f167379f;
                            if (intent6 != null) {
                                C58784w3 w3Var = C58784w3.f168295a;
                                LinkedList<C51163rv3> linkedList = zm22.f186735j;
                                C87412m.m108593f(linkedList, "lbsLife.DescList");
                                intent6.putExtra("get_poi_address", w3Var.mo83874I(linkedList));
                                Intent intent7 = this.f167379f;
                                if (intent7 != null) {
                                    intent7.putExtra("get_poi_classify_id", Util.nullAsNil(zm22.f186729d));
                                } else {
                                    C87412m.m108603p("intent");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("intent");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("intent");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("intent");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("intent");
                    throw null;
                }
            } else {
                C87412m.m108603p("intent");
                throw null;
            }
        } else {
            C87412m.m108603p("intent");
            throw null;
        }
    }

    /* renamed from: g */
    public void mo83368g(MMActivity mMActivity, C57534a aVar, WxRecyclerView wxRecyclerView, int i) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(aVar, "locView");
        this.f167374a = mMActivity;
        this.f167375b = aVar;
        this.f167376c = i;
        aVar.setTextColor(mMActivity.getResources().getColor(C0966R.color.FG_0));
    }

    /* renamed from: h */
    public void mo83369h(Intent intent) {
        C87412m.m108594g(intent, "i");
        Intent intent2 = this.f167379f;
        if (intent2 != null) {
            intent2.putExtra("saveLocation", true);
            Intent intent3 = this.f167379f;
            if (intent3 != null) {
                intent3.putExtra("get_poi_name", Util.nullAs(intent.getStringExtra("get_poi_name"), ""));
                Intent intent4 = this.f167379f;
                if (intent4 != null) {
                    intent4.putExtra("get_city", Util.nullAs(intent.getStringExtra("get_city"), ""));
                    Intent intent5 = this.f167379f;
                    if (intent5 != null) {
                        intent5.putExtra("get_lat", intent.getFloatExtra("get_lat", 0.0f));
                        Intent intent6 = this.f167379f;
                        if (intent6 != null) {
                            intent6.putExtra("get_lng", intent.getFloatExtra("get_lng", 0.0f));
                            Intent intent7 = this.f167379f;
                            if (intent7 != null) {
                                intent7.putExtra("get_poi_address", Util.nullAsNil(intent.getStringExtra("get_poi_address")));
                                Intent intent8 = this.f167379f;
                                if (intent8 != null) {
                                    intent8.putExtra("get_poi_classify_id", Util.nullAsNil(intent.getStringExtra("get_poi_classify_id")));
                                } else {
                                    C87412m.m108603p("intent");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("intent");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("intent");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("intent");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("intent");
                    throw null;
                }
            } else {
                C87412m.m108603p("intent");
                throw null;
            }
        } else {
            C87412m.m108603p("intent");
            throw null;
        }
    }

    /* renamed from: i */
    public final C57534a mo83370i() {
        C57534a aVar = this.f167375b;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("locView");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo83371k() {
        /*
            r9 = this;
            android.content.Intent r0 = r9.f167379f
            java.lang.String r1 = "intent"
            r2 = 0
            if (r0 == 0) goto L_0x017f
            java.lang.String r3 = "saveLocation"
            r4 = 0
            boolean r0 = r0.getBooleanExtra(r3, r4)
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "Finder.FinderLocationWidget"
            java.lang.String r1 = "refreshLocationView no location data, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x0018:
            r9.f167380g = r4
            te3.db1 r0 = new te3.db1
            r0.<init>()
            android.content.Intent r3 = r9.f167379f
            if (r3 == 0) goto L_0x017b
            java.lang.String r5 = "get_poi_name"
            java.lang.String r3 = r3.getStringExtra(r5)
            java.lang.String r5 = ""
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r5)
            r0.f182664g = r3
            android.content.Intent r3 = r9.f167379f
            if (r3 == 0) goto L_0x0177
            java.lang.String r6 = "get_city"
            java.lang.String r3 = r3.getStringExtra(r6)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r5)
            r0.f182663f = r3
            android.content.Intent r3 = r9.f167379f
            if (r3 == 0) goto L_0x0173
            java.lang.String r6 = "get_lat"
            r7 = 0
            float r3 = r3.getFloatExtra(r6, r7)
            r0.f182662e = r3
            android.content.Intent r3 = r9.f167379f
            if (r3 == 0) goto L_0x016f
            java.lang.String r6 = "get_lng"
            float r3 = r3.getFloatExtra(r6, r7)
            r0.f182661d = r3
            android.content.Intent r3 = r9.f167379f
            if (r3 == 0) goto L_0x016b
            java.lang.String r6 = "get_poi_address"
            java.lang.String r3 = r3.getStringExtra(r6)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            r0.f182665h = r3
            android.content.Intent r3 = r9.f167379f
            if (r3 == 0) goto L_0x0167
            java.lang.String r1 = "get_poi_classify_id"
            java.lang.String r1 = r3.getStringExtra(r1)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r0.f182666i = r1
            bl3.r r1 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r3 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r1 = r1.mo62446e(r3)
            java.lang.Class<os1.d> r3 = os1.C62153d.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            os1.d r1 = (os1.C62153d) r1
            boolean r1 = r1.mo9103H()
            r3 = 1
            if (r1 != 0) goto L_0x0093
            r0.f182671q = r3
        L_0x0093:
            r9.f167377d = r0
            android.os.Bundle r1 = r9.f167378e
            if (r1 == 0) goto L_0x0161
            byte[] r6 = r0.toByteArray()
            java.lang.String r8 = "post_location"
            r1.putByteArray(r8, r6)
            java.lang.String r1 = r0.f182664g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x00bb
            java.lang.String r1 = r0.f182663f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00b3
            goto L_0x00bb
        L_0x00b3:
            com.tencent.mm.pluginsdk.location.a r0 = r9.mo83370i()
            r0.mo3294d()
            goto L_0x0102
        L_0x00bb:
            java.lang.String r1 = r0.f182664g
            if (r1 == 0) goto L_0x00c8
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r1 = 0
            goto L_0x00c9
        L_0x00c8:
            r1 = 1
        L_0x00c9:
            if (r1 != 0) goto L_0x00f1
            java.lang.String r1 = r0.f182663f
            if (r1 == 0) goto L_0x00d5
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00d6
        L_0x00d5:
            r4 = 1
        L_0x00d6:
            if (r4 != 0) goto L_0x00f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r0.f182663f
            r1.append(r3)
            java.lang.String r3 = " · "
            r1.append(r3)
            java.lang.String r3 = r0.f182664g
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L_0x00f3
        L_0x00f1:
            java.lang.String r1 = r0.f182664g
        L_0x00f3:
            com.tencent.mm.pluginsdk.location.a r3 = r9.mo83370i()
            java.lang.String r0 = r0.f182663f
            if (r0 != 0) goto L_0x00fc
            r0 = r5
        L_0x00fc:
            if (r1 != 0) goto L_0x00ff
            r1 = r5
        L_0x00ff:
            r3.mo3295e(r0, r1)
        L_0x0102:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            te3.db1 r1 = r9.f167377d
            if (r1 == 0) goto L_0x010f
            java.lang.String r1 = r1.f182666i
            if (r1 != 0) goto L_0x0110
        L_0x010f:
            r1 = r5
        L_0x0110:
            java.lang.String r3 = "poiClassifyId"
            r0.put(r3, r1)
            te3.db1 r1 = r9.f167377d
            if (r1 == 0) goto L_0x011c
            float r1 = r1.f182661d
            goto L_0x011d
        L_0x011c:
            r1 = 0
        L_0x011d:
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r3 = "longitude"
            r0.put(r3, r1)
            te3.db1 r1 = r9.f167377d
            if (r1 == 0) goto L_0x012c
            float r7 = r1.f182662e
        L_0x012c:
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            java.lang.String r3 = "latitude"
            r0.put(r3, r1)
            te3.db1 r1 = r9.f167377d
            if (r1 == 0) goto L_0x013c
            java.lang.String r1 = r1.f182663f
            goto L_0x013d
        L_0x013c:
            r1 = r2
        L_0x013d:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r5)
            java.lang.String r3 = "city"
            r0.put(r3, r1)
            te3.db1 r1 = r9.f167377d
            if (r1 == 0) goto L_0x014c
            java.lang.String r2 = r1.f182665h
        L_0x014c:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r5)
            java.lang.String r2 = "poiname"
            r0.put(r2, r1)
            java.lang.Class<ht1.j5> r1 = ht1.C8777j5.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.j5 r1 = (ht1.C8777j5) r1
            r1.mo9620xL(r0)
            return
        L_0x0161:
            java.lang.String r0 = "postData"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x0167:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x016b:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x016f:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0173:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0177:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x017b:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x017f:
            gy3.C87412m.m108603p(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dr1.C58424t.mo83371k():void");
    }

    /* renamed from: l */
    public void mo83372l(C64311db1 db12) {
        this.f167377d = db12;
    }

    /* renamed from: m */
    public C57534a mo83373m() {
        return mo83370i();
    }
}
