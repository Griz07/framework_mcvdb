package org.apache.torque.tutorial.om;

import java.io.Serializable;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.torque.TorqueException;
import org.apache.torque.map.TableMap;
import org.apache.torque.om.ComboKey;
import org.apache.torque.om.DateKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.StringKey;
import org.apache.torque.om.BooleanKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.om.ColumnAccessByName;
import org.apache.torque.criteria.Criteria;
import org.apache.torque.util.Transaction;
import org.apache.commons.lang.ObjectUtils;


/**
 * Tabla de Usuarios
 *
 * This class was autogenerated by Torque on:
 *
 * [Thu Nov 27 14:55:22 CST 2014]
 *
 * You should not use this class directly.  It should not even be
 * extended; all references should be to Usuario
 */
public abstract class BaseUsuario 
    implements Persistent, Serializable, ColumnAccessByName
{
    /** Serial version */
    private static final long serialVersionUID = 1417121722195L;



    /** Usuario Id */
    private int usuarioId = 0;

    /** Nombre usuario */
    private String nombre = null;

    /** password del candidato */
    private String password = null;

    /** rol del candidato */
    private String rol = null;

    /** Whether this object was modified after loading or after last save. */
    private boolean modified = true;

    /** 
     * Whether this object was loaded from the database or already saved 
     * (false) or whether it is not yet in the database(true).
     */
    private boolean isNew = true;

    /** Flag which indicates whether this object is currently saving. */
    private boolean saving = false;

    /** 
     * Flag which indicates whether this object is currently loaded
     * from the database. 
     */
    private boolean loading = false;

    /** 
     * Flag which indicates whether this object was deleted from the database.
     * Note that this flags does not always display the current database state,
     * there is no magical connection between this flag and the database.
     */
    private boolean deleted = false;





    /**
     * Get the value of usuarioId.
     * The field is described as follows: 
     * Usuario Id
     *
     * @return int
     */
    public int getUsuarioId() 
    {
        
        return usuarioId;
    }

    /**
     * Set the value of usuarioId.
     * The field is described as follows: 
     * Usuario Id
     *
     * @param v new value
     */
    public void setUsuarioId(int v)
    {
        if (this.usuarioId != v)
        {
            setModified(true);
        }

        this.usuarioId = v;


    }
    
    /**
     * Get the value of nombre.
     * The field is described as follows: 
     * Nombre usuario
     *
     * @return String
     */
    public String getNombre() 
    {
        
        return nombre;
    }

    /**
     * Set the value of nombre.
     * The field is described as follows: 
     * Nombre usuario
     *
     * @param v new value
     */
    public void setNombre(String v)
    {
        if (!ObjectUtils.equals(this.nombre, v))
        {
            setModified(true);
        }

        this.nombre = v;


    }
    
    /**
     * Get the value of password.
     * The field is described as follows: 
     * password del candidato
     *
     * @return String
     */
    public String getPassword() 
    {
        
        return password;
    }

    /**
     * Set the value of password.
     * The field is described as follows: 
     * password del candidato
     *
     * @param v new value
     */
    public void setPassword(String v)
    {
        if (!ObjectUtils.equals(this.password, v))
        {
            setModified(true);
        }

        this.password = v;


    }
    
    /**
     * Get the value of rol.
     * The field is described as follows: 
     * rol del candidato
     *
     * @return String
     */
    public String getRol() 
    {
        
        return rol;
    }

    /**
     * Set the value of rol.
     * The field is described as follows: 
     * rol del candidato
     *
     * @param v new value
     */
    public void setRol(String v)
    {
        if (!ObjectUtils.equals(this.rol, v))
        {
            setModified(true);
        }

        this.rol = v;


    }
    

    /**
     * Returns whether the object has ever been saved.  This will
     * be false, if the object was retrieved from storage or was created
     * and then saved.
     *
     * @return true, if the object has never been persisted.
     */
    public boolean isNew()
    {
        return isNew;
    }

    /**
     * Sets whether the object has ever been saved.
     *
     * @param isNew true if the object has never been saved, false otherwise.
     */
    public void setNew(boolean isNew)
    {
        this.isNew = isNew;
    }

    /**
     * Returns whether the object has been modified.
     *
     * @return True if the object has been modified.
     */
    public boolean isModified()
    {
        return modified;
    }

    /**
     * Sets whether the object has been modified.
     *
     * @param modified true if the object has been modified, false otherwise.
     */
    public void setModified(boolean modified)
    {
        this.modified = modified;
    }

    /**
     * Sets the modified state for the object to be false.
     */
    public void resetModified()
    {
        modified = false;
    }


    /**
     * Returns whether this object is currently saving.
     *
     * @return true if this object is currently saving, false otherwise.
     */
    public boolean isSaving()
    {
        return saving;
    }

    /**
     * Sets whether this object is currently saving.
     *
     * @param saving true if this object is currently saving, false otherwise.
     */
    public void setSaving(boolean saving)
    {
        this.saving = saving;
    }


    /**
     * Returns whether this object is currently being loaded from the database.
     *
     * @return true if this object is currently loading, false otherwise.
     */
    public boolean isLoading()
    {
        return loading;
    }

    /**
     * Sets whether this object is currently being loaded from the database.
     *
     * @param loading true if this object is currently loading, false otherwise.
     */
    public void setLoading(boolean loading)
    {
        this.loading = loading;
    }


    /**
     * Returns whether this object was deleted from the database.
     * Note that this getter does not automatically reflect database state,
     * it will be set to true by Torque if doDelete() was called with this 
     * object. Bulk deletes and deletes via primary key do not change
     * this flag. Also, if doDelete() was called on an object which does
     * not exist in the database, the deleted flag is set to true even if
     * it was not deleted.
     *
     * @return true if this object was deleted, false otherwise.
     */
    public boolean isDeleted()
    {
        return deleted;
    }

    /**
     * Sets whether this object was deleted from the database.
     *
     * @param deleted true if this object was deleted, false otherwise.
     */
    public void setDeleted(boolean deleted)
    {
        this.deleted = deleted;
    }







    private static final List<String> FIELD_NAMES;

    static
    {
        List<String> fieldNames
                = new ArrayList<String>();
        fieldNames.add("UsuarioId");
        fieldNames.add("Nombre");
        fieldNames.add("Password");
        fieldNames.add("Rol");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static List<String> getFieldNames()
    {
        return FIELD_NAMES;
    }

    /**
     * Retrieves a field from the object by field (Java) name passed in as a String.
     *
     * @param name field name
     * @return value
     */
    public Object getByName(String name)
    {
        if (name.equals("UsuarioId"))
        {
            return new Integer(getUsuarioId());
        }
        if (name.equals("Nombre"))
        {
            return getNombre();
        }
        if (name.equals("Password"))
        {
            return getPassword();
        }
        if (name.equals("Rol"))
        {
            return getRol();
        }
        return null;
    }

    /**
     * Set a field in the object by field (Java) name.
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByName(String name, Object value)
        throws TorqueException, IllegalArgumentException
    {
        if (name.equals("UsuarioId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setUsuarioId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("Nombre"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setNombre((String) value);
            return true;
        }
        if (name.equals("Password"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setPassword((String) value);
            return true;
        }
        if (name.equals("Rol"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setRol((String) value);
            return true;
        }
        return false;
    }

    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     *
     * @param name peer name
     * @return value
     */
    public Object getByPeerName(String name)
    {
        if (name.equals(org.apache.torque.tutorial.om.UsuarioPeer.USUARIO_ID))
        {
            return new Integer(getUsuarioId());
        }
        if (name.equals(org.apache.torque.tutorial.om.UsuarioPeer.NOMBRE))
        {
            return getNombre();
        }
        if (name.equals(org.apache.torque.tutorial.om.UsuarioPeer.PASSWORD))
        {
            return getPassword();
        }
        if (name.equals(org.apache.torque.tutorial.om.UsuarioPeer.ROL))
        {
            return getRol();
        }
        return null;
    }

    /**
     * Set field values by Peer Field Name
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPeerName(String name, Object value)
        throws TorqueException, IllegalArgumentException
    {
        if (org.apache.torque.tutorial.om.UsuarioPeer.USUARIO_ID.getSqlExpression().equals(name))
        {
            return setByName("UsuarioId", value);
        }
        if (org.apache.torque.tutorial.om.UsuarioPeer.NOMBRE.getSqlExpression().equals(name))
        {
            return setByName("Nombre", value);
        }
        if (org.apache.torque.tutorial.om.UsuarioPeer.PASSWORD.getSqlExpression().equals(name))
        {
            return setByName("Password", value);
        }
        if (org.apache.torque.tutorial.om.UsuarioPeer.ROL.getSqlExpression().equals(name))
        {
            return setByName("Rol", value);
        }
        return false;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     *
     * @param pos position in xml schema
     * @return value
     */
    public Object getByPosition(int pos)
    {
        if (pos == 0)
        {
            return new Integer(getUsuarioId());
        }
        if (pos == 1)
        {
            return getNombre();
        }
        if (pos == 2)
        {
            return getPassword();
        }
        if (pos == 3)
        {
            return getRol();
        }
        return null;
    }

    /**
     * Set field values by its position (zero based) in the XML schema.
     *
     * @param position The field position
     * @param value field value
     * @return True if value was set, false if not (invalid position / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPosition(int position, Object value)
        throws TorqueException, IllegalArgumentException
    {
        if (position == 0)
        {
            return setByName("UsuarioId", value);
        }
        if (position == 1)
        {
            return setByName("Nombre", value);
        }
        if (position == 2)
        {
            return setByName("Password", value);
        }
        if (position == 3)
        {
            return setByName("Rol", value);
        }
        return false;
    }



    /**
     * Stores an object in the database.  If the object is new,
     * it is inserted; otherwise an update is performed.
     *
     * @param toSave the object to be saved, not null.
     *
     * @throws TorqueException if an error occurs during saving.
     */
    public void save() throws TorqueException
    {
        save(UsuarioPeer.DATABASE_NAME);
    }

    /**
     * Stores an object in the database.  If the object is new,
     * it is inserted; otherwise an update is performed.
     *
     * @param toSave the object to be saved, not null.
     * @param dbName the name of the database to which the object
     *        should be saved.
     *
     * @throws TorqueException if an error occurs during saving.
     */
    public void save(String dbName) 
            throws TorqueException
    {
        Connection con = null;
        try
        {
            con = Transaction.begin(dbName);
            save(con);
            Transaction.commit(con);
        }
        catch(TorqueException e)
        {
            Transaction.safeRollback(con);
            throw e;
        }
    }

    /**
     * Stores an object in the database.  If the object is new,
     * it is inserted; otherwise an update is performed.  This method
     * is meant to be used as part of a transaction, otherwise use
     * the save() method and the connection details will be handled
     * internally.
     *
     * @param toSave the object to be saved, not null.
     * @param con the connection to use for saving the object, not null.
     *
     * @throws TorqueException if an error occurs during saving.
     */
    public void save(Connection con) 
            throws TorqueException
    {
        if (isSaving())
        {
            return;
        }
        try
        {
            setSaving(true);
            // If this object has been modified, then save it to the database.
            if (isModified())
            {
                if (isNew())
                {
                    UsuarioPeer.doInsert((Usuario) this, con);
                    setNew(false);
                }
                else
                {
                    UsuarioPeer.doUpdate((Usuario) this, con);
                }
            }

        }
        finally
        {
            setSaving(false);
        }
    }




    /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param key usuarioId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
        setUsuarioId(((NumberKey) key).intValue());
    }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
        setUsuarioId(Integer.parseInt(key));
    }


    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
        return SimpleKey.keyFor(getUsuarioId());
    }



    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     */
    public Usuario copy() throws TorqueException
    {
        return copy(true);
    }

    /**
     * Makes a copy of this object using a connection.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     *
     * @param con the database connection to read associated objects.
     */
    public Usuario copy(Connection con) throws TorqueException
    {
        return copy(true, con);
    }

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     */
    public Usuario copy(boolean deepcopy) throws TorqueException
    {
        Usuario usuario = new Usuario();

        return copyInto(usuario, deepcopy);
    }

    /**
     * Makes a copy of this object using connection.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     * @param con the database connection to read associated objects.
     */
    public Usuario copy(boolean deepcopy, Connection con) throws TorqueException
    {
        Usuario usuario = new Usuario();

        return copyInto(usuario, deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    public Usuario copyInto(Usuario copyObj) throws TorqueException
    {
        return copyInto(copyObj, true);
    }

    /**
     * Fills the copyObj with the contents of this object using connection.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param con the database connection to read associated objects.
     */
    public Usuario copyInto(Usuario copyObj, Connection con) throws TorqueException
    {
        return copyInto(copyObj, true, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     */
    protected Usuario copyInto(Usuario copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setUsuarioId(0);
        copyObj.setNombre(nombre);
        copyObj.setPassword(password);
        copyObj.setRol(rol);

        if (deepcopy)
        {
        }
        return copyObj;
    }
        
    
    /**
     * Fills the copyObj with the contents of this object using connection.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     * @param con the database connection to read associated objects.
     */
    public Usuario copyInto(Usuario copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setUsuarioId(0);
        copyObj.setNombre(nombre);
        copyObj.setPassword(password);
        copyObj.setRol(rol);

        if (deepcopy)
        {
        }
        return copyObj;
    }

    /** The Peer class */
    private static final org.apache.torque.tutorial.om.UsuarioPeer peer
            = new org.apache.torque.tutorial.om.UsuarioPeer();

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public org.apache.torque.tutorial.om.UsuarioPeer getPeer()
    {
        return peer;
    }

    /**
     * Retrieves the TableMap object related to this Table data without
     * compiler warnings of using getPeer().getTableMap().
     *
     * @return The associated TableMap object.
     */
    public TableMap getTableMap() throws TorqueException
    {
        return org.apache.torque.tutorial.om.UsuarioPeer.getTableMap();
    }



    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Usuario:\n");
        str.append("usuarioId = ")
           .append(getUsuarioId())
           .append("\n");
        str.append("nombre = ")
           .append(getNombre())
           .append("\n");
        str.append("password = ")
           .append(getPassword())
           .append("\n");
        str.append("rol = ")
           .append(getRol())
           .append("\n");
        return(str.toString());
    }

    /**
     * Compares the primary key of this instance with the key of another.
     *
     * @param toCompare The object to compare to.
     * @return Whether the primary keys are equal and the object have the
     *         same class.
     */
    public boolean equals(Object toCompare)
    {
        if (toCompare == null)
        {
            return false;
        }
        if (this == toCompare)
        {
            return true;
        }
        if (!getClass().equals(toCompare.getClass()))
        {
            return false;
        }
        Usuario other = (Usuario) toCompare;
        if (getPrimaryKey() == null || other.getPrimaryKey() == null)
        {
            return false;
        }
        return getPrimaryKey().equals(other.getPrimaryKey());
    }

    /**
     * If the primary key is not <code>null</code>, return the hashcode of the
     * primary key.  Otherwise calls <code>Object.hashCode()</code>.
     *
     * @return an <code>int</code> value
     */
    public int hashCode()
    {
        ObjectKey ok = getPrimaryKey();
        if (ok == null)
        {
            return super.hashCode();
        }

        return ok.hashCode();
    }



    /**
     * Compares the content of this object to another object
     *
     * @param toCompare The object to compare to.
     * @return true if all of the columns in the other object have 
     *         the same value as the objects in this class.
     */
    public boolean valueEquals(Usuario toCompare)
    {
        if (toCompare == null)
        {
            return false;
        }
        if (this == toCompare)
        {
            return true;
        }
        if (this.usuarioId != toCompare.getUsuarioId())
        {
            return false;
        }
        if (!ObjectUtils.equals(this.nombre, toCompare.getNombre()))
        {
            return false;
        }
        if (!ObjectUtils.equals(this.password, toCompare.getPassword()))
        {
            return false;
        }
        if (!ObjectUtils.equals(this.rol, toCompare.getRol()))
        {
            return false;
        }
        return true;
    }



}
