import React,{useState} from 'react'
import axios from 'axios';

function SingUP() {
    const [empName, setEmpName] = useState('');
    const [empEmail, setEmail] = useState('');

    const handleSubmit = async (e) => {
        e.preventDefault();

        try {
            // Send registration data to the backend
            await axios.post('http://localhost:9090/employee/save', {
                empName,
                empEmail,
            });

            console.log('User registered successfully');
        } catch (error) {
            console.error('Error registering user', error);
        }
    };
  return (
    <form onSubmit={handleSubmit}>
    <label>
        Name:
        <input
            type="text"
            value={empName}
            onChange={(e) => setEmpName(e.target.value)}
        />
    </label>
    <br />
    <label>
       Email:
        <input
            type="Email"
            value={empEmail}
            onChange={(e) => setEmail(e.target.value)}
        />
    </label>
    <br />
    <button type="submit">Register</button>
</form>
  )
}

export default SingUP