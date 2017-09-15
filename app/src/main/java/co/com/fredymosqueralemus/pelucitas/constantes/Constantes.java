package co.com.fredymosqueralemus.pelucitas.constantes;

/**
 * Created by Fredy Mosquera Lemus on 4/02/17.
 */

public interface Constantes {

    public static final String URL_STORAGE_FIREBASE = "gs://pelucitas-bb90f.appspot.com";
    public static final String USUARIO_FIREBASE_BD = "usuarios";

    public static final String PELUCITAS_SETTINGS = "pelucitas_settings";
    public static final String IMAGENES_LISTVIEW_INICIO = "imagenes_listview_inicio";

    public static final String PERFILES_X_USUARIO_FIREBASE_BD = "perfilesXUsuairo";
    public static final String PERFIL_ADMINISTRADOR_FIREBASE_BD = "administrador";
    public static final String PERFIL_EMPLEADO_FIREBASE_BD = "empleado";
    public static final String PERFIL_CLIENTE_FIREBASE_BD = "cliente";
    public static final String DIRECCIONES_X_USUARIO_FIREBASE_BD = "direccionesXUsuario";
    public static final String DIRECCIONES_X_NEGOCIO_FIREBASE_BD = "direccionesXNegocio";
    public static final String HORARIOS_X_NEGOCIO_FIREBASE_BD = "horariosXNegocio";
    public static final String AGENDA_X_EMPLEADOS = "agendaxEmpleado";
    public static final String TURNOS_X_CLIENTE = "turnosXCliente";

    public static final String MINEGOCIO_FIREBASE_BD = "negocios";
    public static final String TIPOS_NEGOCIOS_FIREBASE_BD = "tiposnegocios";
    public static final String TIPOS_NEGOCIOS_BARBERIA_FIREBASE_BD = "barberia";
    public static final String TIPOS_NEGOCIOS_PELUQUERIA_FIREBASE_BD = "peluqueria";
    public static final String TIPOS_NEGOCIOS_SALONESDEBELLEZA_FIREBASE_BD = "salondebelleza";
    public static final String MINEGOCIO_X_ADMON_FIREBASE_BD = "negociosXAdministrador";

    public static final String EMPLEADOS_X_NEGOCIO = "empleadosXNegocio";

    public static final String NOTIFICACIONES = "notificaciones";

    public static final String FORMAT_DDMMYYYYHHMMSS = "dd/MM/yyyy HH:mm:ss";

    public static final String FORMAT_DDMMYYYY= "dd/MM/yyyy";
    public static final String FORMAT_YYYYMMDD= "yyyy/MM/dd";

    public static final String PETTERN_VALIDA_CORREO = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static final String CALL_FROM_ACTIVITY_REGISTRAR_MINEGOCIO = "CALL_FROM_ACTIVITY_REGISTRAR_MINEGOCIO";
    public static final String CALL_FROM_ACTIVITY_ADMINISTRARMINEGOCIO = "CALL_FROM_ACTIVITY_ADMINISTRARMINEGOCIO";
    public static final String CALL_FROM_ACTIVITY_EDITARMINEGOCIO = "CALL_FROM_ACTIVITY_EDITARMINEGOCIO";
    public static final String NIT_MINEGOCIO = "NIT_MINEGOCIO";
    public static final String CALL_FROM_ACTIVITY_ADMINISTRARMIPERFIL = "CALL_FROM_ACTIVITY_ADMINISTRARMIPERFIL";
    public static final String CALL_FROM_ACTIVITY_MISEMPLEADOS = "CALL_FROM_ACTIVITY_MISEMPLEADOS";

    public static final String CALL_FROM_ACTIVITY_HOME = "CALL_FROM_ACTIVITY_HOME";
    public static final String CALL_FROM_LOGINACTIVITY = "CALL_FROM_LOGINACTIVITY";

    //Constantes numericas
    public static int NUMERO6 = 6;
    public static int NUMERO10 = 10;

    public static String KEY_SHAREDPREFERENCE = "qwertyuiopasdfghjklzxcvbnm/";

    public static String SHARED_PREFERENCES_INFOUSUARIO = "SHARED_PREFERENCES_INFOUSUARIO";
    public static String SECURE_KEY_SHARED_PREFERENCES = "/mnbvcxzlkjhgfdsapoiuytrewq";



    public static final String CORREO = "CORREO";
    public static final String CONTRASENA = "CONTRASENA";
    public static final String ISLOGGED = "ISLOGGED";
    public static final String USERUID = "USERUID";
    public static final String SI = "SI";
    public static final String NO = "NO";

    public static final String MINEGOCIO_OBJECT = "MINEGOCIOCLASS";
    public static final String CONST_IMAGENES = "imagenes";

    public static final String USUARIO_OBJECT = "USUARIO_OBJECT";
    public static final String DIRECCION_OBJECT = "DIRECCION_OBJECT";
    public static final String APP_FOLDER = "/co.com.fredymosqueralemus.pelucitas/imagenes/usuario/perfil";

    public static final int REQUEST_CAMERA = 0;
    public static final int SELECT_FILE = 1;
    public static final String BYTE_ARRAY_IMAGEN_MI_NEGOCIO = "BYTE_ARRAY_IMAGEN_MI_NEGOCIO";

    public static final String SN_READONLY_INFORMACION_USUARIO = "SN_READONLY_INFORMACION_USUARIO";

    public static final String AGENDA_X_NEGOCIO_OBJECT = "AGENDA_X_NEGOCIO_OBJECT";

    public static final String STR_DIA_AGENDA = "STR_DIA_AGENDA";
    public static final String STR_FECHA_AGENDA = "STR_FECHA_AGENDA";

    public static final String  CALL_TO_AGREGAR_AGENDA_XEMPLEADO = "CALL_TO_AGREGAR_AGENDA_XEMPLEADO";
    public static final String  CALL_FROM_ACTIVITY_CONFIGURACIONACTIVITY = "CALL_FROM_ACTIVITY_CONFIGURACIONACTIVITY" ;

    public static final String TIPO_NEGOCIO_SELECCIONADO = "TIPO_NEGOCIO_SELECCIONADO";

    public static final String CALL_FROM_ACTIVITY_VER_PERFIL_PARA_AGENDAR = "CALL_FROM_ACTIVITY_VER_PERFIL_PARA_AGENDAR";

    public static final String CALL_FROM_NOTIFICADORRESERVAAGENDA = "CALL_FROM_NOTIFICADORRESERVAAGENDA";
}
