package ev0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.tencent.p014mm.lan_cs.Client;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C97625j3;
import gv0.C116994i;
import gv0.C20840a;
import gv0.C20842c;
import gv0.C20856m;
import gv0.C20859o;
import gy3.C87412m;
import h81.C32735h;
import hv0.C98544e;
import j20.C117292a;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.UUID;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C89349b;
import pv0.C47525d;
import pv0.C47526f;
import pv0.C62559e;
import qv0.C22133b;
import qv0.C22134c;
import sf0.C77702q0;
import te3.C118432fy1;
import te3.C64844xz;
import yu0.C102910f;
import yu0.C102913k;
import zt3.C119157j;
import zu0.C23575c;
import zu0.C66985a;

/* renamed from: ev0.b */
public class C20615b {

    /* renamed from: w */
    public static int f58023w = 2;

    /* renamed from: a */
    public int f58024a = 0;

    /* renamed from: b */
    public String f58025b;

    /* renamed from: c */
    public String f58026c;

    /* renamed from: d */
    public int f58027d;

    /* renamed from: e */
    public Boolean f58028e = Boolean.FALSE;

    /* renamed from: f */
    public int f58029f = 0;

    /* renamed from: g */
    public int f58030g = 3;

    /* renamed from: h */
    public boolean f58031h = false;

    /* renamed from: i */
    public boolean f58032i = false;

    /* renamed from: j */
    public String f58033j = UUID.randomUUID().toString();

    /* renamed from: k */
    public MTimerHandler f58034k;

    /* renamed from: l */
    public boolean f58035l = true;

    /* renamed from: m */
    public boolean f58036m;

    /* renamed from: n */
    public C89349b f58037n;

    /* renamed from: o */
    public int f58038o;

    /* renamed from: p */
    public boolean f58039p = true;

    /* renamed from: q */
    public final C11385n f58040q = new C20616a();

    /* renamed from: r */
    public final C11385n f58041r = new C20618c();

    /* renamed from: s */
    public final C20842c.C20846e f58042s = new C20619d();

    /* renamed from: t */
    public final C20859o.C20861b f58043t = new C20620e();

    /* renamed from: u */
    public final C20856m.C20858b f58044u = new C20621f();

    /* renamed from: v */
    public C20842c.C20845d f58045v = new C20622g(this);

    /* renamed from: ev0.b$a */
    public class C20616a implements C11385n {
        public C20616a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String str2;
            int i3 = i;
            int i4 = i2;
            C97625j3.m125815e().mo123470p(595, C20615b.this.f58040q);
            C20615b.this.f58028e = Boolean.FALSE;
            if (i3 == 0 && i4 == 0) {
                C118432fy1 fy12 = (C118432fy1) ((C116994i) yVar).f350571e.f127056b.f127083a;
                if (!Util.nullAsNil((String) C97625j3.m125812b().mo105906u().mo119684e(2, (Object) null)).equals(fy12.f354016p)) {
                    Log.m105920e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: not the same account");
                    C20612a.m22480i().mo142622e().mo142628f(-5);
                    C20612a.m22480i().mo32276l().mo32309g(-5);
                    C115669n.INSTANCE.idkeyStat(400, 112, 1, false);
                    return;
                }
                LinkedList<C64844xz> linkedList = fy12.f354013j;
                if (linkedList == null || linkedList.size() <= 0 || fy12.f354013j.getFirst() == null) {
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(fy12.f354012i);
                    if (fy12.f354013j == null) {
                        str2 = "null";
                    } else {
                        str2 = "" + fy12.f354013j.size();
                    }
                    objArr[1] = str2;
                    Log.m105921e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd AddrList is empty! AddrCount[%d], AddrList size[%s]", objArr);
                    C20612a.m22480i().mo142622e().mo142628f(-5);
                    C20612a.m22480i().mo32276l().mo32309g(-5);
                    C115669n.INSTANCE.idkeyStat(400, 113, 1, false);
                    return;
                }
                String str3 = fy12.f354015o;
                if (str3 != null) {
                    C20615b.this.f58028e = Boolean.valueOf(str3.indexOf("__migrateetargim__") > 0);
                }
                int i5 = fy12.f354018r;
                if (i5 == 100 || i5 == 101) {
                    C20615b.this.f58028e = Boolean.TRUE;
                }
                if (i5 == 100) {
                    C87412m.m108594g(2, "value");
                    StringBuilder sb = new StringBuilder();
                    sb.append("reportAndCommit() called with: key = ");
                    sb.append("Type");
                    sb.append(", value = ");
                    sb.append(2);
                    sb.append(" stack:");
                    int i6 = C77702q0.f226484a;
                    sb.append(new C77702q0.C77703a());
                    Log.m105918d("BackupReport", sb.toString());
                    C22133b.f62617a.mo35248a(2, 1, C20615b.this.f58033j);
                } else if (i5 == 101) {
                    C87412m.m108594g(3, "value");
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("reportAndCommit() called with: key = ");
                    sb4.append("Type");
                    sb4.append(", value = ");
                    sb4.append(3);
                    sb4.append(" stack:");
                    int i7 = C77702q0.f226484a;
                    sb4.append(new C77702q0.C77703a());
                    Log.m105918d("BackupReport", sb4.toString());
                    C22133b.f62617a.mo35248a(3, 1, C20615b.this.f58033j);
                }
                C20615b.this.f58030g = fy12.f354018r;
                C64844xz first = fy12.f354013j.getFirst();
                String str4 = first.f186422d;
                int intValue = first.f186423e.getFirst().intValue();
                C20615b bVar = C20615b.this;
                bVar.f58025b = fy12.f354020t;
                bVar.f58026c = str4;
                bVar.f58027d = intValue;
                Log.m105925i("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd type:%d, scene:%d, wifiName:%s, ip:%s, port:%d", Integer.valueOf(fy12.f354011h), Integer.valueOf(fy12.f354018r), fy12.f354020t, str4, Integer.valueOf(intValue));
                C20612a.m22480i().f303742b = fy12.f354007d;
                C20612a.m22480i().f303743c = fy12.f354009f;
                C20612a.m22480i().f303744d = fy12.f354010g;
                C20612a.m22480i().f303746f = fy12.f354008e.f140574f.f257327a;
                C20615b bVar2 = C20615b.this;
                bVar2.getClass();
                Class<BackupMigratePCUI> cls = BackupMigratePCUI.class;
                C20842c.f58880n = 1;
                C20612a.m22480i().mo17658f();
                C87412m.m108594g(0, "value");
                StringBuilder sb5 = new StringBuilder();
                sb5.append("reportAndCommit() called with: key = ");
                sb5.append("Type");
                sb5.append(", value = ");
                sb5.append(0);
                sb5.append(" stack:");
                int i8 = C77702q0.f226484a;
                sb5.append(new C77702q0.C77703a());
                Log.m105918d("BackupReport", sb5.toString());
                C20842c.f58886t = bVar2.f58045v;
                C20842c.f58878i = bVar2.f58042s;
                C20842c.f58879j = C20612a.m22480i().mo32273h();
                C20612a.m22480i().mo142622e().mo142628f(1);
                if (!bVar2.f58028e.booleanValue()) {
                    Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI");
                    className.addFlags(335544320);
                    className.putExtra("nofification_type", "back_to_pcmgr_notification");
                    Context context = MMApplicationContext.getContext();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(className);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backuppcmove/BackupPcProcessMgr", "startConnectPc", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcProcessMgr", "startConnectPc", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C20612a.m22480i();
                    SharedPreferences.Editor edit = C102910f.m136016d().edit();
                    edit.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
                    edit.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
                    edit.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0);
                    edit.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0);
                    edit.commit();
                } else if (!Util.getTopActivityName(MMApplicationContext.getContext()).equals(cls.getName())) {
                    Intent intent = new Intent(MMApplicationContext.getContext(), cls);
                    intent.addFlags(335544320);
                    intent.putExtra("nofification_type", "back_to_pcmgr_notification");
                    Context context3 = MMApplicationContext.getContext();
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    Context context4 = context3;
                    C117292a.m165358d(context4, aVar2.mo10232b(), "com/tencent/mm/plugin/backup/backuppcmove/BackupPcProcessMgr", "startConnectPc", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context3.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(context4, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcProcessMgr", "startConnectPc", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                bVar2.f58031h = false;
                Log.m105925i("MicroMsg.BackupPcProcessMgr", "startConnectPc, PC ip:%s, PC wifi:%s, Phone wifi:%s", bVar2.f58026c, bVar2.f58025b, C102913k.m136029A(MMApplicationContext.getContext()));
                C20615b.f58023w = 2;
                bVar2.mo32288l();
                return;
            }
            Log.m105925i("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: other error[%d,%d,%s]", Integer.valueOf(i), Integer.valueOf(i2), str);
            C115669n.INSTANCE.idkeyStat(400, 111, 1, false);
            if (i3 == 4 && i4 == -2011) {
                Log.m105920e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: INVALID URL");
            }
            C20612a.m22480i().mo142622e().mo142628f(-5);
            C20612a.m22480i().mo32276l().mo32309g(-5);
        }
    }

    /* renamed from: ev0.b$b */
    public class C20617b implements MTimerHandler.CallBack {
        public C20617b() {
        }

        public boolean onTimerExpired() {
            if (C20615b.this.f58031h) {
                return true;
            }
            Log.m105920e("MicroMsg.BackupPcProcessMgr", "tryConnect overtime failed.");
            MTimerHandler mTimerHandler = C20615b.this.f58034k;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            C20615b.m22493a(C20615b.this);
            C22134c.m25609a("Status", 3);
            return true;
        }
    }

    /* renamed from: ev0.b$c */
    public class C20618c implements C11385n {
        public C20618c() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            char c;
            int i3 = i2;
            C20615b.this.f58031h = true;
            C22134c.m25609a("Status", 0);
            C20615b.this.f58034k.stopTimer();
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(13736, 0, C20615b.this.f58025b, C102913k.m136029A(MMApplicationContext.getContext()), 0, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
            C20842c.m22884u1(1, C20615b.this.f58041r);
            if (i == 0 && i3 == 0) {
                C20840a aVar = (C20840a) yVar;
                int i4 = aVar.f58866v.f62321j;
                boolean z = (i4 & 2) != 0;
                boolean z2 = (i4 & 4) != 0;
                boolean z3 = (i4 & 8) != 0;
                Log.m105925i("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd auth success, pcSupportTimeSelect[%b], pcSupportQuickBackup[%b], pcSupportReconnect[%b]", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
                if (z3) {
                    C89349b bVar = aVar.f58866v.f62322n;
                    if (bVar == null) {
                        bVar = null;
                    }
                    if (bVar != null) {
                        C20615b bVar2 = C20615b.this;
                        bVar2.f58036m = false;
                        bVar2.f58037n = bVar;
                    } else {
                        Log.m105920e("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd pcSupportReconnect but token is null!");
                        C20615b bVar3 = C20615b.this;
                        bVar3.f58036m = false;
                        bVar3.f58037n = null;
                    }
                } else {
                    C20615b bVar4 = C20615b.this;
                    bVar4.f58036m = false;
                    bVar4.f58037n = null;
                }
                C20612a.m22480i().mo32276l().getClass();
                C20612a.m22480i().mo32276l().getClass();
                return;
            }
            Log.m105921e("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd auth failed, errType[%d], errCode[%d], errMsg[%s]", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i3 == -3) {
                c = 3;
                nVar.idkeyStat(400, 115, 1, false);
            } else if (i3 != -1) {
                c = 3;
                nVar.idkeyStat(400, 116, 1, false);
            } else {
                c = 3;
                nVar.idkeyStat(400, 114, 1, false);
            }
            Object[] objArr = new Object[5];
            objArr[0] = 1;
            objArr[1] = 0;
            objArr[2] = 0;
            objArr[c] = 0;
            objArr[4] = Integer.valueOf(C20615b.this.f58038o);
            nVar.mo160131h(13737, objArr);
            C20612a.m22480i().mo142622e().mo142628f(-5);
            C20612a.m22480i().mo32276l().mo32309g(-5);
        }
    }

    /* renamed from: ev0.b$d */
    public class C20619d implements C20842c.C20846e {
        public C20619d() {
        }

        /* renamed from: a */
        public void mo17669a(boolean z, int i, byte[] bArr, int i2) {
            int i3 = i;
            byte[] bArr2 = bArr;
            int i4 = i2;
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(z);
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = Integer.valueOf(bArr2 == null ? -1 : bArr2.length);
            Log.m105925i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify isLocal[%b], type[%d], seq[%d], buf[%d]", objArr);
            if (!z || bArr2 == null) {
                if (i3 == 17) {
                    C62559e eVar = new C62559e();
                    try {
                        eVar.parseFrom(bArr2);
                        Log.m105925i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify receive commandReq, command[%d]", Integer.valueOf(eVar.f177684d));
                        int i5 = eVar.f177684d;
                        if (i5 != 1) {
                            if (i5 != 3) {
                                int i6 = 6;
                                if (i5 != 5) {
                                    if (i5 != 7) {
                                        if (i5 != 11) {
                                            if (i5 != 13) {
                                                if (i5 != 15) {
                                                    if (i5 != 17) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    C22133b.f62617a.mo35248a(6, 2, C20615b.this.f58033j);
                                    if (!((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_BACKUP_PC_RECOVERING_BOOLEAN, Boolean.FALSE)).booleanValue()) {
                                        Log.m105924i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify not recovering, start new recover.");
                                        C20615b.m22495c(C20615b.this, eVar.f177684d, i4);
                                    } else if (!C20612a.m22480i().mo32275k().mo32295e()) {
                                        Log.m105924i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify MsgDataIdList not exist, start new recover.");
                                        C20615b.m22495c(C20615b.this, eVar.f177684d, i4);
                                    } else {
                                        C20842c.f58882p.mo32562c();
                                        Log.m105924i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify continue Recover.");
                                        C115669n.INSTANCE.idkeyStat(400, 30, 1, false);
                                        C20615b.this.f58024a = 4;
                                        C20612a.m22480i().mo32275k().mo32294d();
                                        C20615b.this.mo32282f(eVar.f177684d, i4);
                                        C20633g l = C20612a.m22480i().mo32276l();
                                        l.getClass();
                                        MMHandlerThread.postToMainThread(new C20641h(l, new HashSet(l.f58092d)));
                                        C20615b.this.mo32281e(eVar.f177684d == 17 ? 18 : 8);
                                    }
                                }
                                C22133b.f62617a.mo35248a(5, 2, C20615b.this.f58033j);
                                if (!((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_BACKUP_PC_BACKUPING_BOOLEAN, Boolean.FALSE)).booleanValue()) {
                                    Log.m105924i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify not backuping, start new backup.");
                                    C20615b.m22494b(C20615b.this, eVar.f177684d, i4);
                                } else {
                                    LinkedList<String> linkedList = C20612a.m22480i().mo32276l().f58089a;
                                    if (linkedList != null) {
                                        if (linkedList.size() != 0) {
                                            Log.m105924i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify start continue Backup.");
                                            C115669n.INSTANCE.idkeyStat(400, 29, 1, false);
                                            C20615b.this.f58024a = 3;
                                            C20612a.m22480i().mo32276l().mo32308f();
                                            C20612a.m22480i().mo32276l().mo17698b(linkedList);
                                            C20615b.this.mo32282f(eVar.f177684d, i4);
                                            C20633g l2 = C20612a.m22480i().mo32276l();
                                            l2.getClass();
                                            MMHandlerThread.postToMainThread(new C20641h(l2, new HashSet(l2.f58092d)));
                                            C20615b bVar = C20615b.this;
                                            if (eVar.f177684d == 13) {
                                                i6 = 14;
                                            }
                                            bVar.mo32281e(i6);
                                            C20633g l3 = C20612a.m22480i().mo32276l();
                                            l3.getClass();
                                            C98544e.m128035f().mo137899c();
                                            l3.mo32305c((long) l3.f58089a.size());
                                        }
                                    }
                                    Log.m105924i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify sessionString is null, start new backup.");
                                    C20615b.m22494b(C20615b.this, eVar.f177684d, i4);
                                }
                            }
                            C20615b.m22495c(C20615b.this, i5, i4);
                        }
                        C20615b.m22494b(C20615b.this, i5, i4);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.BackupPcProcessMgr", e, "onBackupPcProcessMgrNotify buf to BackupCommandRequest error.", new Object[0]);
                    }
                }
                if (i3 == 5) {
                    Log.m105924i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify receive cancelReq");
                    C115669n.INSTANCE.mo160131h(13737, 5, 0, 0, 0, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
                    C20612a.m22480i().mo142622e().mo142628f(-100);
                    C20612a.m22480i().mo32276l().mo32309g(-100);
                }
            } else if (10011 == i3) {
                int a = C20612a.m22480i().mo142622e().mo142623a();
                Log.m105925i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify local disconnect, backupPcState[%d]", Integer.valueOf(a));
                if (a == -100 || a == -21 || a == -5) {
                    C20612a.m22480i().mo32273h().mo37036e();
                } else if (a == -2) {
                    C20612a.m22480i().mo142622e().mo142628f(-2);
                    C20612a.m22480i().mo32276l().mo32309g(-2);
                    C20612a.m22480i().mo32273h().mo37036e();
                } else if (a == 1) {
                    C20615b bVar2 = C20615b.this;
                    if (!bVar2.f58031h) {
                        if (bVar2.f58034k != null) {
                            Log.m105924i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify stop backupConnectTimerHandler.");
                            C20615b.this.f58034k.stopTimer();
                        }
                        C20615b.m22493a(C20615b.this);
                    } else {
                        C20612a.m22480i().mo32273h().mo37036e();
                        C20612a.m22480i().mo142622e().mo142628f(-4);
                        C20612a.m22480i().mo32276l().mo32309g(-4);
                    }
                }
                C20615b.this.f58031h = false;
            }
        }
    }

    /* renamed from: ev0.b$e */
    public class C20620e implements C20859o.C20861b {
        public C20620e() {
        }

        /* renamed from: a */
        public void mo17682a() {
            int i = C20612a.m22480i().mo32274j().f58024a;
            if (1 == i || 3 == i) {
                C20612a.m22480i().mo32276l().mo32309g(C20612a.m22480i().mo142622e().mo142623a());
            } else if (2 == i || 4 == i) {
                C20612a.m22480i().mo32275k().mo17667K(C20612a.m22480i().mo142622e().mo142623a());
            }
        }

        /* renamed from: b */
        public void mo17683b() {
            int a = C20612a.m22480i().mo142622e().mo142623a();
            Log.m105921e("MicroMsg.BackupPcProcessMgr", "speedOverTime callback, backupState[%d]", Integer.valueOf(a));
            int i = C20612a.m22480i().mo32274j().f58024a;
            if ((1 == i || 3 == i) && (a == 14 || a == 4)) {
                C20612a.m22480i().mo32273h().mo37036e();
                C20612a.m22480i().mo32276l().mo32307e(true);
                C115669n.INSTANCE.idkeyStat(400, 9, 1, false);
                C20612a.m22480i().mo32276l().mo32306d(13737, 18);
                C20612a.m22480i().mo142622e().mo142628f(-4);
                C20612a.m22480i().mo32276l().mo32309g(-4);
            } else if (2 != i && 4 != i) {
            } else {
                if (a == 23 || a == 4) {
                    C20612a.m22480i().mo32273h().mo37036e();
                    C20612a.m22480i().mo32275k().mo32292b(true, false, -4);
                    C115669n.INSTANCE.idkeyStat(400, 17, 1, false);
                    C20612a.m22480i().mo32275k().mo32291a(13737, 18);
                }
            }
        }

        /* renamed from: c */
        public void mo17684c(int i) {
            int a = C20612a.m22480i().mo142622e().mo142623a();
            if (i == 1) {
                int i2 = C20615b.this.f58024a;
                if ((1 == i2 || 3 == i2) && a == 14) {
                    Log.m105924i("MicroMsg.BackupPcProcessMgr", "speedCallback is weak connect now.");
                    C20612a.m22480i().mo142622e().mo142628f(4);
                    C20612a.m22480i().mo32276l().mo32309g(4);
                } else if ((2 == i2 || 4 == i2) && a == 23) {
                    Log.m105924i("MicroMsg.BackupPcProcessMgr", "speedCallback is weak connect now.");
                    C20612a.m22480i().mo142622e().mo142628f(4);
                    C20612a.m22480i().mo32275k().mo17667K(4);
                }
            } else if (i == 0 && a == 4) {
                Log.m105924i("MicroMsg.BackupPcProcessMgr", "speedCallback is normal speed now.");
                int i3 = C20615b.this.f58024a;
                if (1 == i3 || 3 == i3) {
                    C20612a.m22480i().mo142622e().mo142628f(14);
                    C20612a.m22480i().mo32276l().mo32309g(14);
                } else if (2 == i3 || 4 == i3) {
                    C20612a.m22480i().mo142622e().mo142628f(23);
                    C20612a.m22480i().mo32275k().mo17667K(23);
                }
            }
        }
    }

    /* renamed from: ev0.b$f */
    public class C20621f implements C20856m.C20858b {
        public C20621f() {
        }
    }

    /* renamed from: ev0.b$g */
    public class C20622g implements C20842c.C20845d {
        public C20622g(C20615b bVar) {
        }

        /* renamed from: a */
        public void mo17681a() {
            Log.m105924i("MicroMsg.BackupPcProcessMgr", "engineStopCallback ");
            C20842c.m22876D1();
            C20612a.m22480i().mo17659g();
        }
    }

    /* renamed from: a */
    public static void m22493a(C20615b bVar) {
        C20615b bVar2 = bVar;
        String str = bVar2.f58025b;
        String str2 = bVar2.f58026c;
        String A = C102913k.m136029A(MMApplicationContext.getContext());
        C20612a.m22480i().mo32273h().mo37036e();
        Log.m105921e("MicroMsg.BackupPcProcessMgr", "tryConnectFailed thisWifiName:%s, pcWifiName:%s, pcIpAddress:%s, tryCount:%d", A, str, str2, Integer.valueOf(f58023w));
        if (A == null || A.equals("")) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(400, 1, 1, false);
            nVar.mo160131h(13736, 1, str, A, 0, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
            C20612a.m22480i().mo142622e().mo142628f(-1);
            C20612a.m22480i().mo32276l().mo32309g(-1);
        } else if (str == null || !str.equals(A)) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.idkeyStat(400, 2, 1, false);
            nVar2.mo160131h(13736, 2, str, A, 0, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
            C20612a.m22480i().mo142622e().mo142628f(-2);
            C20612a.m22480i().mo32276l().mo32309g(-2);
        } else if (!C102913k.m136030B(str2)) {
            C115669n nVar3 = C115669n.INSTANCE;
            nVar3.idkeyStat(400, 3, 1, false);
            nVar3.mo160131h(13736, 3, str, A, 0, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
            C20612a.m22480i().mo142622e().mo142628f(-3);
            C20612a.m22480i().mo32276l().mo32309g(-3);
        } else {
            int i = f58023w;
            if (i <= 0) {
                C115669n nVar4 = C115669n.INSTANCE;
                nVar4.idkeyStat(400, 63, 1, false);
                nVar4.mo160131h(13736, 6, str, A, 0, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
                C20612a.m22480i().mo142622e().mo142628f(-5);
                C20612a.m22480i().mo32276l().mo32309g(-5);
                return;
            }
            f58023w = i - 1;
            bVar.mo32288l();
        }
    }

    /* renamed from: b */
    public static void m22494b(C20615b bVar, int i, int i2) {
        bVar.getClass();
        Log.m105925i("MicroMsg.BackupPcProcessMgr", "newBackup, command[%d]", Integer.valueOf(i));
        bVar.f58024a = 1;
        if (bVar.mo32286j()) {
            C20612a.m22480i().f303745e = null;
        }
        C20612a.m22480i().mo32276l().mo32308f();
        C20633g l = C20612a.m22480i().mo32276l();
        l.getClass();
        Log.m105924i("MicroMsg.BackupPcServer", "clearContinueBackupData.");
        l.f58091c.mo37044b(false);
        LinkedList<String> linkedList = l.f58089a;
        if (linkedList != null) {
            linkedList.clear();
        }
        bVar.mo32282f(i, i2);
        C20633g l2 = C20612a.m22480i().mo32276l();
        l2.getClass();
        MMHandlerThread.postToMainThread(new C20641h(l2, new HashSet(l2.f58092d)));
    }

    /* renamed from: c */
    public static void m22495c(C20615b bVar, int i, int i2) {
        bVar.getClass();
        Log.m105925i("MicroMsg.BackupPcProcessMgr", "newRecover, command[%d]", Integer.valueOf(i));
        bVar.f58024a = 2;
        if (!bVar.mo32286j()) {
            C20612a.m22480i().f303745e = null;
        }
        C20612a.m22480i().mo32275k().mo32294d();
        ((C119157j) C119157j.f356862d).mo183875f(new C20623c(bVar, i, i2));
        C20625e k = C20612a.m22480i().mo32275k();
        k.getClass();
        MMHandlerThread.postToMainThread(new C20632f(k, new HashSet(k.f58065n)));
        C20842c.f58882p.mo32562c();
    }

    /* renamed from: d */
    public void mo32280d() {
        Log.m105924i("MicroMsg.BackupPcProcessMgr", "backupSendCancelRequest.");
        C47525d dVar = new C47525d();
        dVar.f127501d = C20612a.m22480i().f303742b;
        try {
            C20842c.m22885v1(dVar.toByteArray(), 5);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupPcProcessMgr", e, "BackupCancelRequest to buf err.", new Object[0]);
        }
    }

    /* renamed from: e */
    public void mo32281e(int i) {
        Log.m105925i("MicroMsg.BackupPcProcessMgr", "backupSendCommandRequest cmd:%d", Integer.valueOf(i));
        if (i == 12 || i == 16) {
            this.f58033j = UUID.randomUUID().toString();
        }
        C62559e eVar = new C62559e();
        eVar.f177684d = i;
        if (i == 9) {
            eVar.f177685e = this.f58037n;
        }
        try {
            C20842c.m22885v1(eVar.toByteArray(), 17);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupPcProcessMgr", e, "BackupCommandRequest to buf err.", new Object[0]);
        }
    }

    /* renamed from: f */
    public void mo32282f(int i, int i2) {
        Log.m105925i("MicroMsg.BackupPcProcessMgr", "backupSendCommandResponse cmd:%d", Integer.valueOf(i));
        C47526f fVar = new C47526f();
        fVar.f127502d = i;
        try {
            C20842c.m22886w1(fVar.toByteArray(), 18, i2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupPcProcessMgr", e, "BackupCommandResponse to buf err.", new Object[0]);
        }
    }

    /* renamed from: g */
    public int mo32283g() {
        if (!mo32285i()) {
            C87412m.m108594g(5, "value");
            StringBuilder sb = new StringBuilder();
            sb.append("reportAndCommit() called with: key = ");
            sb.append("Type");
            sb.append(", value = ");
            sb.append(5);
            sb.append(" stack:");
            int i = C77702q0.f226484a;
            sb.append(new C77702q0.C77703a());
            Log.m105918d("BackupReport", sb.toString());
            C22133b.f62617a.mo35248a(5, 1, this.f58033j);
        }
        return mo32285i() ? 12 : 2;
    }

    /* renamed from: h */
    public void mo32284h() {
        Log.m105924i("MicroMsg.BackupPcProcessMgr", "mgr finish");
        int i = 0;
        this.f58029f = 0;
        this.f58032i = false;
        this.f58031h = false;
        this.f58030g = 0;
        C20612a.m22480i().f303745e = null;
        C85801v1 u = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_BACKUP_PC_RECOVERING_BOOLEAN;
        Boolean bool = Boolean.FALSE;
        u.mo119677K(aVar, bool);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_PC_BACKUPING_BOOLEAN, bool);
        C22133b bVar = C22133b.f62617a;
        int i2 = this.f58024a;
        if (1 == i2 || 3 == i2) {
            i = 5;
        } else if (2 == i2 || 4 == i2) {
            i = 6;
        }
        bVar.mo35248a(i, 3, this.f58033j);
    }

    /* renamed from: i */
    public boolean mo32285i() {
        return this.f58028e.booleanValue();
    }

    /* renamed from: j */
    public boolean mo32286j() {
        int i = this.f58030g;
        return i == 100 || i == 101;
    }

    /* renamed from: k */
    public void mo32287k() {
        Log.m105928w("MicroMsg.BackupPcProcessMgr", "notify migrate pause");
        C20842c.f58882p.f58948j += System.currentTimeMillis();
        Log.m105924i("MicroMsg.BackupSpeedCalculator", "pauseTick");
        C20612a.m22480i().mo142622e().mo142628f(-25);
        C20612a.m22480i().mo32276l().mo32309g(-25);
        C22133b bVar = C22133b.f62617a;
        int i = this.f58024a;
        bVar.mo35248a((1 == i || 3 == i) ? 5 : (2 == i || 4 == i) ? 6 : 0, 4, this.f58033j);
    }

    /* renamed from: l */
    public final void mo32288l() {
        C23575c h = C20612a.m22480i().mo32273h();
        String str = this.f58026c;
        int i = this.f58027d;
        h.f67576a.set(2);
        h.f67577b = str;
        h.f67578c = i;
        Client.f157040a = new C66985a(h);
        C20842c.m22881n1();
        C20842c.m22879k1(1, this.f58041r);
        C20840a aVar = new C20840a(C20612a.m22480i().f303743c, C20612a.m22480i().f303744d, C102910f.f303739h, C20612a.m22480i().f303742b, 0, 1, false);
        aVar.mo32541F1(true, true, true, false, false);
        aVar.f58865u.f62314j = 1;
        aVar.mo32547o1();
        Log.m105924i("MicroMsg.BackupPcProcessMgr", "tryConnect start backupConnectTimerHandler.");
        if (this.f58034k == null) {
            this.f58034k = new MTimerHandler(new C20617b(), false);
        }
        this.f58034k.startTimer((long) (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_backup_connect_overtime_and, 30) * 1000));
    }
}
