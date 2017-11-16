package main.Java;

public class User
{
    private Boolean administrator;

    private String firstname;
    private String lastname;
    private String password;

    public User(Boolean administrator, String firstname, String lastname, String password)
    {
        this.administrator = administrator;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
    }

    public Boolean getAdministrator()
    {
        return administrator;
    }

    public void setAdministrator(Boolean administrator)
    {
        this.administrator = administrator;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void deleteRecipe(Recipe r)
    {
        if(r.getCook().equals(this)|| this.getAdministrator())
        {
            r.setCook(null);
        }
        else
        {
            System.out.println("Du bist weder Admin, noch Verfasser! nix löschen.");
        }
    }
    public void deleteValuation(Recipe x, Valuation v)
    {
        if(v.getAuthor().equals(this) || this.getAdministrator())
        {
            x.getValuationList().remove(v);
            x.calcAvgScore();
        }
        else
        {
            System.out.println("nope.");
        }
    }
}