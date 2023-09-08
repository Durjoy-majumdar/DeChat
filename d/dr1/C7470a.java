package dr1;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.view.FinderExtendActivityView;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import fe1.C58965i;
import gy3.C87412m;
import kd1.C9579a;
import te3.C52271zj0;
import zc1.C66785b;

/* renamed from: dr1.a */
public final class C7470a implements C58965i {

    /* renamed from: a */
    public final FinderExtendActivityView f25683a;

    /* renamed from: b */
    public Intent f25684b;

    public C7470a(FinderExtendActivityView finderExtendActivityView) {
        C87412m.m108594g(finderExtendActivityView, "activityView");
        this.f25683a = finderExtendActivityView;
    }

    /* renamed from: b */
    public void mo8612b(Intent intent, Bundle bundle) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(bundle, "postData");
        this.f25684b = intent;
        C9579a.C9580a aVar = C9579a.f29816a;
        Intent intent2 = C9579a.f29817b;
        if (intent2 != null) {
            Log.m105924i("Finder.ActivityParamStore", "restore");
            aVar.mo10259a(intent2, intent);
        }
        this.f25683a.mo4463a(intent, intent.getIntExtra("key_activity_type", 100));
    }

    /* renamed from: i */
    public final C52271zj0 mo8613i() {
        Intent intent = this.f25684b;
        if (intent != null) {
            int i = 0;
            if (!intent.getBooleanExtra("saveActivity", false)) {
                return null;
            }
            C52271zj0 zj02 = new C52271zj0();
            Intent intent2 = this.f25684b;
            if (intent2 != null) {
                zj02.f146005d = intent2.getLongExtra("key_topic_id", 0);
                Intent intent3 = this.f25684b;
                if (intent3 != null) {
                    if (intent3.getIntExtra("key_activity_type", 0) != 101) {
                        i = 1;
                    }
                    zj02.f146019u = i;
                    FinderContact finderContact = new FinderContact();
                    String str = "";
                    if (zj02.f146019u == 0) {
                        finderContact.username = C66785b.f191882e.mo90662O5();
                    } else {
                        Intent intent4 = this.f25684b;
                        if (intent4 != null) {
                            String stringExtra = intent4.getStringExtra("key_user_name");
                            if (stringExtra == null) {
                                stringExtra = str;
                            }
                            finderContact.username = stringExtra;
                        } else {
                            C87412m.m108603p("intent");
                            throw null;
                        }
                    }
                    Intent intent5 = this.f25684b;
                    if (intent5 != null) {
                        String stringExtra2 = intent5.getStringExtra("key_nick_name");
                        if (stringExtra2 == null) {
                            stringExtra2 = str;
                        }
                        finderContact.nickname = stringExtra2;
                        Intent intent6 = this.f25684b;
                        if (intent6 != null) {
                            String stringExtra3 = intent6.getStringExtra("key_avatar_url");
                            if (stringExtra3 == null) {
                                stringExtra3 = str;
                            }
                            finderContact.headUrl = stringExtra3;
                            zj02.f146006e = finderContact;
                            Intent intent7 = this.f25684b;
                            if (intent7 != null) {
                                String stringExtra4 = intent7.getStringExtra("key_cover_url");
                                if (stringExtra4 == null) {
                                    stringExtra4 = str;
                                }
                                zj02.f146010i = stringExtra4;
                                Intent intent8 = this.f25684b;
                                if (intent8 != null) {
                                    String stringExtra5 = intent8.getStringExtra("key_activity_name");
                                    if (stringExtra5 == null) {
                                        stringExtra5 = str;
                                    }
                                    zj02.f146007f = stringExtra5;
                                    Intent intent9 = this.f25684b;
                                    if (intent9 != null) {
                                        String stringExtra6 = intent9.getStringExtra("key_activity_desc");
                                        if (stringExtra6 != null) {
                                            str = stringExtra6;
                                        }
                                        zj02.f146008g = str;
                                        Intent intent10 = this.f25684b;
                                        if (intent10 != null) {
                                            zj02.f146018t = intent10.getLongExtra("key_activity_end_time", 0);
                                            Intent intent11 = this.f25684b;
                                            if (intent11 != null) {
                                                zj02.f146022x = intent11.getLongExtra("key_activity_display_mask", 0);
                                                return zj02;
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
                C87412m.m108603p("intent");
                throw null;
            }
            C87412m.m108603p("intent");
            throw null;
        }
        C87412m.m108603p("intent");
        throw null;
    }

    /* renamed from: j */
    public final void mo8614j(Intent intent) {
        C87412m.m108594g(intent, "intent");
        int intExtra = intent.getIntExtra("key_activity_type", 100);
        Intent intent2 = this.f25684b;
        if (intent2 != null) {
            intent2.putExtra("saveActivity", true);
            this.f25683a.mo4463a(intent, intExtra);
            FinderExtendActivityView finderExtendActivityView = this.f25683a;
            Intent intent3 = this.f25684b;
            if (intent3 != null) {
                finderExtendActivityView.setIntentParam(intent3);
            } else {
                C87412m.m108603p("intent");
                throw null;
            }
        } else {
            C87412m.m108603p("intent");
            throw null;
        }
    }
}
